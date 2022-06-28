package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrievProductInfo {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbUrl="jdbc:mysql://localhost:3306/AmazonDb";
		String username="root";
		String password="root";
		String query="select * from Product;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(dbUrl,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.print("Brand: "+rs.getString("BrandName")+"\t");
			System.out.print("ProductId: "+rs.getInt("Product_Id")+"\t");
			System.out.print("Price: "+rs.getInt("Price")+"\t"+"\n");
			
			
		}
	}
}
