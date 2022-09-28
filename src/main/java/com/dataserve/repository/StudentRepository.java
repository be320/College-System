package com.dataserve.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ejb.Singleton;

import com.dataserve.entity.Department;
import com.dataserve.entity.Student;
import com.dataserve.utils.DBconnection;
import com.dataserve.utils.StaticData;


public class StudentRepository {

	DBconnection dbConnection = new DBconnection();

	DepartmentRepository departmentRepository = new DepartmentRepository();

	public void addStudent(Student student) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_ADD;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setDouble(2, student.getGpa());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new student was inserted successfully!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public Student getStudentById(Integer id) {
		Student studentResponse = new Student();
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_GET;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				studentResponse.setStudentId(result.getInt("studentId"));
				studentResponse.setName(result.getString("name"));
				studentResponse.setGpa(result.getDouble("gpa"));
				if (result.getInt("departmentId") > 0)
					studentResponse.setDepartment(departmentRepository.getDepartmentById(result.getInt("departmentId")));
			}
			
			return studentResponse;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}

	public void editStudent(Student student) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_EDIT;
		Student oldData = getStudentById(student.getStudentId());
		if (student.getName() == null)
			student.setName(oldData.getName());
		if (student.getGpa() == null)
			student.setGpa(oldData.getGpa());
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setDouble(2, student.getGpa());
			statement.setInt(3, student.getStudentId());
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing student was updated successfully!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void deleteStudentById(Integer id) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_DELETE;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A student was deleted successfully!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void assignStudentToDepartment(Integer studentId, Integer departmentId) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_EDIT_DEPARTMENT;
		Student student = getStudentById(studentId);
		Department department = departmentRepository.getDepartmentById(departmentId);
		student.setDepartment(department);
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, departmentId);
			statement.setInt(2, studentId);
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing student was updated successfully!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public List<Student> getAllStudents() {
		List<Student> studentResponse = new ArrayList<Student>();
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_GET_ALL;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Student student = new Student();
				student.setStudentId(result.getInt("studentId"));
				student.setName(result.getString("name"));
				student.setGpa(result.getDouble("gpa"));
				if (result.getInt("departmentId") > 0)
					student.setDepartment(departmentRepository.getDepartmentById(result.getInt("departmentId")));
				studentResponse.add(student);
			}
			
			return studentResponse;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}

	public List<Student> getAllStudentsByDepartment(Integer departmentId) {
		List<Student> studentResponse = new ArrayList<Student>();
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_STUDENT_GET_ALL_DEPARTMENT;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, departmentId);
			ResultSet result = statement.executeQuery();
			Department department = departmentRepository.getDepartmentById(departmentId);
			while (result.next()) {
				Student student = new Student();
				student.setStudentId(result.getInt("studentId"));
				student.setName(result.getString("name"));
				student.setGpa(result.getDouble("gpa"));
				student.setDepartment(department);
				studentResponse.add(student);
			}
			
			return studentResponse;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}

}
