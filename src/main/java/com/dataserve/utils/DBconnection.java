package com.dataserve.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DBconnection {

	@Inject
	private Connection connection;

	public Connection connectToDatabase() {
		if (this.connection != null)
			return this.connection;
		try {
			Connection conn = DriverManager.getConnection(StaticData.DB_URL, StaticData.DB_USER, StaticData.DB_PASS);
			this.connection = conn;
			return this.connection;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	public void closeConnection() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Error: There is no opened connection");
		}
	}

}
