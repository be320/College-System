package com.dataserve.api;

import com.dataserve.entity.Student;

public interface StudentAPI {
	
	public Student addStudent(Student student);
	
	public Student getStudentById(Integer id); 
	
	public Student editStudent(Student student);
	
	public String deleteStudentById(Integer id);
	
	public Student assignStudentToDepartment(Integer studentId, Integer departmentId);
}
