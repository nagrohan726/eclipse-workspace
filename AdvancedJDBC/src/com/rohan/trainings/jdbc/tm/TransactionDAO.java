package com.rohan.trainings.jdbc.tm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAO {

	public static void main(String[] args) {

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
			Statement stmt = con.createStatement();

			con.setAutoCommit(false);

			stmt.executeUpdate("update account set bal=bal-500 where accno=5");
			stmt.executeUpdate("update account set bal=bal+500 where accno=4");

			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

}
