package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateRowDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbUrl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		String query="{call selectAllMovies()}";
		String query1="Update movies Set director='Peter Doctor' where title='Inside outside';";
		Connection con=null;
				
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection(dbUrl,username,password);
		Statement stmt=con.createStatement();
		stmt.executeUpdate(query1);
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.print("title: "+rs.getString("title")+"\t");
			System.out.print("genre: "+rs.getString("genre")+"\t");
			System.out.println();
			
		}
}

}
