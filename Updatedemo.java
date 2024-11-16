package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatedemo 
{

  public static void main(String[] args) throws Exception
 {
	  
	  String city1 = "banglore";
	  String name1 = "kamal";
		
	Class.forName("com.mysql.cj.jdbc.Driver");	  
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
	
	 PreparedStatement ps = con.prepareStatement("update register set city=? where name=?");
	 ps.setString(1, city1);
	 ps.setString(2, name1);
	 
	 int count = ps.executeUpdate();
	 
	 if(count >0)
	 {
		 System.out.println("Update successfully");
	 }
	 else 
	 {
		System.out.println("Updation failed");
	}
	 
		con.close(); 
 }
	
}
