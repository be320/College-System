package com.dataserve.controller;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dataserve.api.DepartmentAPI;
import com.dataserve.dto.Response;
import com.dataserve.entity.Department;
import com.dataserve.service.DepartmentService;
import com.dataserve.utils.SystemCodes;

@Path("/departments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Singleton
public class DepartmentController implements DepartmentAPI {

	private DepartmentService departmentService = new DepartmentService();

	
	@POST
	@Override
	public Response addDepartment(Department department) {
		Response response = new Response();
		try {
			response = departmentService.addDepartment(department);
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
	public Response getDepartmentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = departmentService.getDepartmentById(id);
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
	public Response editDepartment(Department department) {
		Response response = new Response();
		try {
			response = departmentService.editDepartment(department);
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
	public Response deleteDepartmentById(@PathParam("id") Integer id) {
		Response response = new Response();
		try {
			response = departmentService.deleteDepartmentById(id);
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
	public Response getAllDepartments() {
		Response response = new Response();
		try {
			response = departmentService.getAllDepartments();
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getCode());
			response.setDescription(
					SystemCodes.StatusMessages.INTERNAL_SERVER_ERROR.getDescription() + ex.getMessage());
			return response;
		}
	}

}
