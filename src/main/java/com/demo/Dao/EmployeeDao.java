package com.demo.Dao;

import java.sql.*;

import com.entity.Employee;

public class EmployeeDao {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee", "root", "Waghobaa@111");
		return con;
	}

	public static int registerEmployee(Employee ee) throws SQLException, ClassNotFoundException {
		System.out.println(1);
		Connection con = EmployeeDao.getConnection();
		System.out.println(2);
		String query = "INSERT INTO employee" + "(id, fullName, age, gmail_id, salary, password)values"
				+ "(?,?,?,?,?,?);";

		System.out.println(3);
		PreparedStatement ps = con.prepareStatement(query);
		// ps.setString(1,"5");
		// ps.setString(2,"Rutuja" );
		// ps.setString(3,"25" );
		// ps.setString(4,"Rutujasnp@gmail.com" );
		// ps.setString(5,"60000");
		// ps.setString(6 ,"duku" );
		ps.setString(1, ee.getId());
		ps.setString(2, ee.getName());
		ps.setString(3, ee.getAge());
		ps.setString(4, ee.getGmail());
		ps.setString(5, ee.getSalary());
		ps.setString(6, ee.getPassword());
		System.out.println(4);
		System.out.println(ps);
		int result = ps.executeUpdate();
		System.out.println(5);
		System.out.println(result + " rows affected !");
		return result;
	}

	public static int updateEmployee(Employee ee) throws SQLException, ClassNotFoundException{
		System.out.println(1);
Connection con= EmployeeDao.getConnection();
System.out.println(2);
String query = "UPDATE Employee SET id=?,name=?,age=?,gmail_id=?,salary=?,password=? WHERE id=?";
PreparedStatement ps=con.prepareStatement(query);
System.out.println(3);
ps.setString(1, ee.getId());
ps.setString(2, ee.getName());
ps.setString(3, ee.getAge());
ps.setString(4, ee.getGmail());
ps.setString(5, ee.getSalary());
ps.setString(6, ee.getPassword());
System.out.println(4);
System.out.println(ps);
int result=ps.executeUpdate();
System.out.println(5);
if(result>0) {
	System.out.println(result + " rows affected !");
}
else {
	System.out.println(result + ", no rows affected !");
}

return result;


	}
	/*
	 * private void printSQLException(SQLException ex) { for (Throwable e: ex) { if
	 * (e instanceof SQLException) { e.printStackTrace(System.err);
	 * System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	 * System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	 * System.err.println("Message: " + e.getMessage()); Throwable t =
	 * ex.getCause(); while (t != null) { System.out.println("Cause: " + t); t =
	 * t.getCause(); } } } }
	 */
	/*
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { EmployeeDao.registerEmployee(); }
	 */

}
