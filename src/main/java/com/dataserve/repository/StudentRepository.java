package com.dataserve.repository;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.entity.Student;
import com.dataserve.utils.DBconnection;
import com.dataserve.utils.SystemCodes;

@Singleton
public class StudentRepository {
	
	@Inject
	DBconnection dBconnection;
	
	public Response addStudent(Student student) {
		Response response = new Response();
		try {
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
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response editStudent(Student student) {
		Response response = new Response();
		try {
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response deleteStudentById(Integer id) {
		Response response = new Response();
		try {
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response assignStudentToDepartment(Integer studentId, Integer departmentId) {
		Response response = new Response();
		try {
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
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

}
