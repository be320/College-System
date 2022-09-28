package com.dataserve.service;

import java.util.List;

import javax.inject.Inject;
import javax.ejb.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.dto.ResponseBody;
import com.dataserve.entity.Student;
import com.dataserve.repository.StudentRepository;
import com.dataserve.utils.SystemCodes;

@Singleton
public class StudentService {

	private StudentRepository studentRepository = new StudentRepository();

	@Transactional(rollbackOn = Exception.class)
	public Response addStudent(Student student) {
		Response response = new Response();
		try {
			studentRepository.addStudent(student);
			response.setCode(SystemCodes.StatusMessages.CREATED.getCode());
			response.setDescription(SystemCodes.StatusMessages.CREATED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getStudentById(Integer id) {
		Response response = new Response();
		try {
			Student student = studentRepository.getStudentById(id);
			ResponseBody responseBody = new ResponseBody();
			responseBody.setStudent(student);
			response.setResponseBody(responseBody);
			response.setCode(SystemCodes.StatusMessages.RECEIVED.getCode());
			response.setDescription(SystemCodes.StatusMessages.RECEIVED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response editStudent(Student student) {
		Response response = new Response();
		try {
			studentRepository.editStudent(student);
			response.setCode(SystemCodes.StatusMessages.UPDATED.getCode());
			response.setDescription(SystemCodes.StatusMessages.UPDATED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response deleteStudentById(Integer id) {
		Response response = new Response();
		try {
			studentRepository.deleteStudentById(id);
			response.setCode(SystemCodes.StatusMessages.DELETED.getCode());
			response.setDescription(SystemCodes.StatusMessages.DELETED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response assignStudentToDepartment(Integer studentId, Integer departmentId) {
		Response response = new Response();
		try {
			studentRepository.assignStudentToDepartment(studentId, departmentId);
			response.setCode(SystemCodes.StatusMessages.UPDATED.getCode());
			response.setDescription(SystemCodes.StatusMessages.UPDATED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getAllStudents() {
		Response response = new Response();
		try {
			List<Student> students = studentRepository.getAllStudents();
			ResponseBody responseBody = new ResponseBody();
			responseBody.setStudentList(students);
			response.setResponseBody(responseBody);
			response.setCode(SystemCodes.StatusMessages.RECEIVED.getCode());
			response.setDescription(SystemCodes.StatusMessages.RECEIVED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getAllStudentsByDepartment(Integer departmentId) {
		Response response = new Response();
		try {
			List<Student> students = studentRepository.getAllStudentsByDepartment(departmentId);
			ResponseBody responseBody = new ResponseBody();
			responseBody.setStudentList(students);
			response.setResponseBody(responseBody);
			response.setCode(SystemCodes.StatusMessages.RECEIVED.getCode());
			response.setDescription(SystemCodes.StatusMessages.RECEIVED.getDescription());
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

}
