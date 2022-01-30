<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%!
	Connection con;
	PreparedStatement ps;
	
	public void jspInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
			ps = con.prepareStatement("insert into account value(?,?,?,?)");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void jspDestroy() {
		try {
			ps.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
%>

<%

	int accNo = Integer.parseInt(request.getParameter("accountNo"));
	String lastName = request.getParameter("lastName");
	String firstName = request.getParameter("firstName");
	int balance = Integer.parseInt(request.getParameter("balance"));
	
	ps.setInt(1, accNo);
	ps.setString(2, lastName);
	ps.setString(3, firstName);
	ps.setInt(4, balance);
	
	ps.executeUpdate();
%>

<%@ include file="openAccount.html" %>