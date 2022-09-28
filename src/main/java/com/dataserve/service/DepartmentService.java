package com.dataserve.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.dto.ResponseBody;
import com.dataserve.entity.Department;
import com.dataserve.entity.Student;
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
			departmentRepository.addDepartment(department);
			response.setCode(SystemCodes.StatusMessages.CREATED.getCode());
			response.setDescription(SystemCodes.StatusMessages.CREATED.getDescription());
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getDepartmentById(Integer id) {
		Response response = new Response();
		try {
			Department department = departmentRepository.getDepartmentById(id);
			ResponseBody responseBody = new ResponseBody();
			responseBody.setDepartment(department);
			response.setResponseBody(responseBody);
			response.setCode(SystemCodes.StatusMessages.RECEIVED.getCode());
			response.setDescription(SystemCodes.StatusMessages.RECEIVED.getDescription());
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response editDepartment(Department department) {
		Response response = new Response();
		try {
			departmentRepository.editDepartment(department);
			response.setCode(SystemCodes.StatusMessages.UPDATED.getCode());
			response.setDescription(SystemCodes.StatusMessages.UPDATED.getDescription());
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public Response deleteDepartmentById(Integer id) {
		Response response = new Response();
		try {
			departmentRepository.deleteDepartmentById(id);
			response.setCode(SystemCodes.StatusMessages.DELETED.getCode());
			response.setDescription(SystemCodes.StatusMessages.DELETED.getDescription());
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public Response getAllDepartments() {
		Response response = new Response();
		try {
			List<Department> departments = departmentRepository.getAllDepartments();
			ResponseBody responseBody = new ResponseBody();
			responseBody.setDepartmentList(departments);
			response.setResponseBody(responseBody);
			response.setCode(SystemCodes.StatusMessages.RECEIVED.getCode());
			response.setDescription(SystemCodes.StatusMessages.RECEIVED.getDescription());
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

}
