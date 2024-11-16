package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertDemo 
{

	  public static void main(String[] args) throws Exception
	  {
		  //-----------------user values-------------------
		  
		  String name1 = "Adi";
		  String email1 = "Adi@gmail.com";
		  String pass1 = "Adi@";
		  String gender1 = "male";
		  String city1 ="Baglore";
		  
		  //----------database connectivity--------------------
		  Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		 
		 
		  //----write insert query-------------------------
		 PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		 
		 //---------------set values in database----------------
		 ps.setString(1, name1);
		 ps.setString(2, email1);
		 ps.setString(3, pass1);
		 ps.setString(4, gender1);
		 ps.setString(5, city1);
		 
		 
		  int i = ps.executeUpdate();
		 
		 if(i>0) 
		 {
			System.out.println("success");
		 }
		 else {
			 {
				 System.out.println("fail");
			 }
		}
		 
	}
	
}
