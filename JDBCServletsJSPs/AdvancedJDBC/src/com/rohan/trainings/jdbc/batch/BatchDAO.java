package com.rohan.trainings.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
				Statement stmt = con.createStatement();) {

			stmt.addBatch("insert into account values(4, 'Clinton', 'Bill', 10000)");
			stmt.addBatch("insert into account values(5, 'Clinton', 'Hillary', 20000)");

			int[] batch = stmt.executeBatch();

			for (int i : batch) {
				System.out.println(i);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
