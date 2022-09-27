package com.dataserve.api;

import com.dataserve.dto.Response;
import com.dataserve.entity.Student;

public interface StudentAPI {

	public Response addStudent(Student student);

	public Response getStudentById(Integer id);

	public Response editStudent(Student student);

	public Response deleteStudentById(Integer id);

	public Response assignStudentToDepartment(Integer studentId, Integer departmentId);

	public Response getAllStudents();

	public Response getAllStudentsByDepartment(Integer departmentId);
}
