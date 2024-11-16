package in.sp.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.cj.protocol.Resultset;

public class selectDemo 
{
  public static void main(String[] args) throws Exception
  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
	  
	  PreparedStatement ps = con.prepareStatement("select * from register");
	    ResultSet rs = ps.executeQuery();
	    
	 while(rs.next())
	 {
		// String name1 = rs.getString("name");
		// System.out.println(name1);
		 
		// String email1 = rs.getString("email");
		// System.out.println(email1);
		 
		// String pass1 = rs.getString("password");
		// System.out.println(pass1);
		 
		// String gender1 = rs.getString("gender");
		// System.out.println(gender1);
		 
		// String city1 = rs.getString("city");
		// System.out.println(city1);
		 
		 System.out.println("name : "+rs.getString("name"));
		 System.out.println("email : "+rs.getString("email"));
		 System.out.println("password : "+rs.getString("password"));
		 System.out.println("gender : "+rs.getString("gender"));
		 System.out.println("city : "+rs.getString("city"));
		 
		
		 
	 }
	 
	 con.close();
	  
  }
}
