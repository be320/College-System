package com.dataserve.utils;

public class StaticData {

	// Database Connection
	public static final String DB_URL = "jdbc:mysql://localhost:3306/college";
	public static final String DB_USER = "root";
	public static final String DB_PASS = "root";

	// SQL Queries
	public static final String QUERY_STUDENT_ADD = "INSERT INTO student (name, gpa) VALUES (?, ?)";
	public static final String QUERY_STUDENT_GET = "SELECT * FROM student WHERE studentId=?";
	public static final String QUERY_STUDENT_EDIT = "UPDATE student SET name=?, gpa=?, departmentId=? WHERE studentId=?";
	public static final String QUERY_STUDENT_DELETE = "DELETE FROM student WHERE studentId=?";
	public static final String QUERY_STUDENT_GET_ALL = "SELECT * FROM student";
	public static final String QUERY_STUDENT_GET_ALL_DEPARTMENT = "SELECT * FROM student WHERE departmentId=?";

}
