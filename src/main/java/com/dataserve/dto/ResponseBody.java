package com.dataserve.dto;

import java.util.List;

import com.dataserve.entity.Department;
import com.dataserve.entity.Student;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBody {

	@JsonProperty("student")
	private Student student;

	@JsonProperty("department")
	private Department department;

	@JsonProperty("studentList")
	private List<Student> studentList;

	@JsonProperty("departmentList")
	private List<Department> departmentList;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

}
