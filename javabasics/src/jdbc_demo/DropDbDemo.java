package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDbDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbUrl="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		String query="Drop Database sample4;";
		String query1="show databases;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(dbUrl,username,password);
		Statement stmt=con.createStatement();
		
		stmt.execute(query);
		ResultSet rs=stmt.executeQuery(query1);
		//stmt.execute(query1);
		while(rs.next())
		{
			System.out.println(rs.getString("Database"));
		}
	}

}
