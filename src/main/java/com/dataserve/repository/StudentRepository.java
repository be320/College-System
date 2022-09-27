package com.dataserve.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import com.dataserve.dto.Response;
import com.dataserve.entity.Student;
import com.dataserve.utils.DBconnection;
import com.dataserve.utils.StaticData;
import com.dataserve.utils.SystemCodes;

@Singleton
public class StudentRepository {

	@Inject
	DBconnection dbConnection;

	@Inject
	DepartmentRepository departmentRepository;

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
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				studentResponse.setStudentId(result.getInt("studentId"));
				studentResponse.setName(result.getString("name"));
				studentResponse.setGpa(result.getDouble("gpa"));
				studentResponse.setDepartment(departmentRepository.getDepartmentById(result.getInt("departmentId")));
			}
			return studentResponse;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void editStudent(Student student) {
		Response response = new Response();
		try {
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public void deleteStudentById(Integer id) {
		Response response = new Response();
		try {
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public void assignStudentToDepartment(Integer studentId, Integer departmentId) {
		Response response = new Response();
		try {
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public List<Student> getAllStudents() {
		Response response = new Response();
		try {
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

	public List<Student> getAllStudentsByDepartment(Integer departmentId) {
		Response response = new Response();
		try {
			return response;
		} catch (Exception ex) {
			response.setCode(SystemCodes.StatusMessages.GENERAL_ERROR.getCode());
			response.setDescription(SystemCodes.StatusMessages.GENERAL_ERROR.getDescription());
			return response;
		}
	}

}
