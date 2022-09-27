package com.dataserve.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.dataserve.api.StudentAPI;
import com.dataserve.dto.Response;
import com.dataserve.entity.Student;
import com.dataserve.utils.SystemCodes;

@Path("/students")
public class StudentController implements StudentAPI {

	@Override
	@POST
	public Response addStudent(Student student) {
		return null;
	}

	@Override
    @GET
    @Path("/{id}")
	public Response getStudentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PUT
	public Response editStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/{id}")
	public Response deleteStudentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@POST
	@Path("/{studentId}/department/{departmentId}")
	public Response assignStudentToDepartment(@PathParam("studentId") Integer studentId, @PathParam("departmentId") Integer departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	public Response getAllStudents() {
		Response response = new Response();
		response.setCode(SystemCodes.StatusMessages.OK.getCode());
		response.setDescription(SystemCodes.StatusMessages.OK.getDescription());
		response.setResponseBody(null);
		return response;
	}

	@Override
	@GET
	@Path("/department/{departmentId}")
	public Response getAllStudentsByDepartment(Integer departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
