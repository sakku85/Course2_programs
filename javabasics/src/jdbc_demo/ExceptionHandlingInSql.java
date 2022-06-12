package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandlingInSql {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbUrl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		String query="{call selectAllMovies()}";
		Connection con=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection(dbUrl,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.print("title: "+rs.getString("title")+"\t");
			System.out.print("genre: "+rs.getString("genre")+"\t");
			System.out.println();
			
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			
		}
		finally {
			con.close();
		}
}
}
