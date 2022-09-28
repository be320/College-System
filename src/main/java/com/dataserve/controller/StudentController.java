package com.dataserve.controller;

import javax.inject.Inject;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import com.dataserve.api.StudentAPI;
import com.dataserve.dto.Response;
import com.dataserve.entity.Student;
import com.dataserve.service.StudentService;
import com.dataserve.utils.SystemCodes;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Singleton
public class StudentController implements StudentAPI {

	
	private StudentService studentService = new StudentService();

	
	@POST
	@Override
	public Response addStudent(Student student) {
		Response response = new Response();
		try {
			response = studentService.addStudent(student);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@GET
	@Path("/{id}")
	@Override
	public Response getStudentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = studentService.getStudentById(id);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@PUT
	@Override
	public Response editStudent(Student student) {
		Response response = new Response();
		try {
			response = studentService.editStudent(student);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@DELETE
	@Path("/{id}")
	@Override
	public Response deleteStudentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = studentService.deleteStudentById(id);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@PUT
	@Path("/{studentId}/department/{departmentId}")
	@Override
	public Response assignStudentToDepartment(@PathParam("studentId") Integer studentId,
			@PathParam("departmentId") Integer departmentId) {
		Response response = new Response();
		try {
			response = studentService.assignStudentToDepartment(studentId, departmentId);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@GET
	@Override
	public Response getAllStudents() {
		Response response = new Response();
		try {
			response = studentService.getAllStudents();
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	
	@GET
	@Path("/department/{departmentId}")
	@Override
	public Response getAllStudentsByDepartment(@PathParam("departmentId") Integer departmentId) {
		Response response = new Response();
		try {
			response = studentService.getAllStudentsByDepartment(departmentId);
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

}
