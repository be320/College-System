package com.dataserve.service;

import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.entity.Department;
import com.dataserve.utils.SystemCodes;

@Singleton
public class DepartmentService {
	
	@Transactional
	public Response addDepartment(Department department) {
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

	public Response getDepartmentById(Integer id) {
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

	@Transactional
	public Response editDepartment(Department department) {
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

	@Transactional
	public Response deleteDepartmentById(Integer id) {
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

	public Response getAllDepartments() {
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
