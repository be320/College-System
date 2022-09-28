package com.dataserve.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.dataserve.entity.Department;
import com.dataserve.utils.DBconnection;
import com.dataserve.utils.StaticData;

@Singleton
public class DepartmentRepository {

	@Inject
	DBconnection dbConnection;

	public void addDepartment(Department department) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_DEPARTMENT_ADD;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, department.getName());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new department was inserted successfully!");
			}
			dbConnection.closeConnection();
		} catch (SQLException e) {
			dbConnection.closeConnection();
			e.printStackTrace();
		}
	}

	public Department getDepartmentById(Integer id) {
		Department response = new Department();
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_DEPARTMENT_GET;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				response.setDepartmentId(result.getInt("departmentId"));
				response.setName(result.getString("name"));
			}
			dbConnection.closeConnection();
			return response;
		} catch (SQLException e) {
			dbConnection.closeConnection();
			e.printStackTrace();
			return null;
		}
	}

	public void editDepartment(Department department) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_DEPARTMENT_EDIT;
		Department oldData = getDepartmentById(department.getDepartmentId());
		if (department.getName() == null)
			department.setName(oldData.getName());
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, department.getName());
			statement.setInt(2, department.getDepartmentId());
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing department was updated successfully!");
			}
			dbConnection.closeConnection();
		} catch (SQLException e) {
			dbConnection.closeConnection();
			e.printStackTrace();
		}
	}

	public void deleteDepartmentById(Integer id) {
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_DEPARTMENT_DELETE;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A department was deleted successfully!");
			}
			dbConnection.closeConnection();
		} catch (SQLException e) {
			dbConnection.closeConnection();
			e.printStackTrace();
		}
	}

	public List<Department> getAllDepartments() {
		List<Department> response = new ArrayList<Department>();
		Connection connection = dbConnection.connectToDatabase();
		String sql = StaticData.QUERY_DEPARTMENT_GET_ALL;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Department department = new Department();
				department.setDepartmentId(result.getInt("departmentId"));
				department.setName(result.getString("name"));
				response.add(department);
			}
			dbConnection.closeConnection();
			return response;
		} catch (SQLException e) {
			dbConnection.closeConnection();
			e.printStackTrace();
			return null;
		}
	}

}
