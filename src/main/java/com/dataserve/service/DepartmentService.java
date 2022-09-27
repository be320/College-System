package com.dataserve.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.entity.Department;
import com.dataserve.repository.DepartmentRepository;
import com.dataserve.utils.SystemCodes;

@Singleton
public class DepartmentService {
	
	@Inject
	private DepartmentRepository departmentRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public Response addDepartment(Department department) {
		Response response = new Response();
		try {
			response = 
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

	@Transactional(rollbackOn = Exception.class)
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

	@Transactional(rollbackOn = Exception.class)
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
