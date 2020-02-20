package com.capgemini.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class TicketDB {
	public static Connection getConnection1()throws ClassNotFoundException, SQLException
	{
		String drivername="oracle.jdbc.driver.OracleDriver";
		Class.forName(drivername);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anurag","anurag123");
		return con;
}}
