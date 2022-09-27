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
import com.dataserve.service.DepartmentService;
import com.dataserve.utils.SystemCodes;

@Path("/departments")
public class DepartmentController implements DepartmentAPI {
	
	private DepartmentService departmentService = new DepartmentService();

	@Override
	@POST
	public Response addDepartment(Department department) {
		Response response = new Response();
		try {
			response = departmentService.addDepartment(department);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	@Override
    @GET
    @Path("/{id}")
	public Response getDepartmentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = departmentService.getDepartmentById(id);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	@Override
	@PUT
	public Response editDepartment(Department department) {
		Response response = new Response();
		try {
			response = departmentService.editDepartment(department);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	@Override
	@DELETE
	@Path("/{id}")
	public Response deleteDepartmentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = departmentService.deleteDepartmentById(id);
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

	@Override
	@GET
	public Response getAllDepartments() {
		Response response = new Response();
		try {
			response = departmentService.getAllDepartments();
			return response;
		}
		catch(Exception ex) {	
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

}
