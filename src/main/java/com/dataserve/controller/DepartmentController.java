package com.dataserve.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.dataserve.api.DepartmentAPI;
import com.dataserve.entity.Department;

@Path("/departments")
public class DepartmentController implements DepartmentAPI {

	@Override
	@POST
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    @GET
    @Path("/{id}")
	public Department getDepartmentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PUT
	public Department editDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/{id}")
	public String deleteDepartmentById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
