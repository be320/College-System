package com.dataserve.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.entity.Student;
import com.dataserve.repository.StudentRepository;
import com.dataserve.utils.SystemCodes;

@Singleton
public class StudentService {
	
	@Inject
	private StudentRepository studentRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public Response addStudent(Student student) {
		Response response = new Response();
		try {
			response = studentRepository.addStudent(student);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getStudentById(Integer id) {
		Response response = new Response();
		try {
			response = studentRepository.getStudentById(id);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response editStudent(Student student) {
		Response response = new Response();
		try {
			response = studentRepository.editStudent(student);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response deleteStudentById(Integer id) {
		Response response = new Response();
		try {
			response = studentRepository.deleteStudentById(id);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response assignStudentToDepartment(Integer studentId, Integer departmentId) {
		Response response = new Response();
		try {
			response = studentRepository.assignStudentToDepartment(studentId, departmentId);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getAllStudents() {
		Response response = new Response();
		try {
			response = studentRepository.getAllStudents();
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getAllStudentsByDepartment(Integer departmentId) {
		Response response = new Response();
		try {
			response = studentRepository.getAllStudentsByDepartment(departmentId);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

}
