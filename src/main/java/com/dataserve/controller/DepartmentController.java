package com.dataserve.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.dataserve.api.DepartmentAPI;
import com.dataserve.dto.Response;
import com.dataserve.entity.Department;

@Path("/departments")
public class DepartmentController implements DepartmentAPI {

	@Override
	@POST
	public Response addDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    @GET
    @Path("/{id}")
	public Response getDepartmentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PUT
	public Response editDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/{id}")
	public Response deleteDepartmentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	public Response getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

}
