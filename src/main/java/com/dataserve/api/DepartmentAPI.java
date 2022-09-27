package com.dataserve.api;

import com.dataserve.dto.Response;
import com.dataserve.entity.Department;

public interface DepartmentAPI {
	
	public Response addDepartment(Department department);
	
	public Response getDepartmentById(Integer id);
	
	public Response editDepartment(Department department);
	
	public Response deleteDepartmentById(Integer id);
	
	public Response getAllDepartments();

}
