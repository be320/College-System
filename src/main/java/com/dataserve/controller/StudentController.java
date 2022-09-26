package com.dataserve.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.dataserve.api.StudentAPI;
import com.dataserve.entity.Student;

@Path("/students")
public class StudentController implements StudentAPI {

	@Override
	@POST
	public Student addStudent(Student student) {
		return null;
	}

	@Override
    @GET
    @Path("/{id}")
	public Student getStudentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PUT
	public Student editStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/{id}")
	public String deleteStudentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@POST
	@Path("/{studentId}/department/{departmentId}")
	public Student assignStudentToDepartment(@PathParam("studentId") Integer studentId, @PathParam("departmentId") Integer departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
