package com.dataserve.api;

import com.dataserve.entity.Department;

public interface DepartmentAPI {
	
	public Department addDepartment(Department department);
	
	public Department getDepartmentById(Integer id);
	
	public Department editDepartment(Department department);
	
	public String deleteDepartmentById(Integer id);

}
