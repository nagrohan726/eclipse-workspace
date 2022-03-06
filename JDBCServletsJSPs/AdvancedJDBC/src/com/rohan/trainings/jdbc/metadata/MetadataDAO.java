package com.rohan.trainings.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadataDAO {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
				Statement stmt = con.createStatement();) {

			ResultSet rs = stmt.executeQuery("select * from account");
			ResultSetMetaData rsmd = rs.getMetaData();

			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println(rsmd.getColumnName(i) + "  --  " + rsmd.getColumnTypeName(i));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
