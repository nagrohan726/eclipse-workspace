package com.rohan.user.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

/**
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	public void init(ServletConfig config) {
		try {
			System.out.println("init()");
			ServletContext context = config.getServletContext();

			Enumeration<String> contextNames = context.getInitParameterNames();
			while (contextNames.hasMoreElements()) {
				String name = contextNames.nextElement();
				System.out.println("Context Param Name: " + name);
				System.out.println("Context Param Value: " + context.getInitParameter(name));
			}

			Class.forName(context.getInitParameter("driverClass"));
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),
					context.getInitParameter("dbUser"), context.getInitParameter("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into user values('" + firstName + "','" + lastName + "','"
					+ email + "','" + password + "')");
			PrintWriter out = response.getWriter();
			if (result > 0) {
				out.print("<H1>USER CREATED</H1>");
			} else {
				out.print("<H1>Error Creating the User</H1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
