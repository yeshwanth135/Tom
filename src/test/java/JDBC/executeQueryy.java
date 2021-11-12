package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class executeQueryy {
	
	@Test
	public void executequereytest() throws Throwable {
		
	   Connection con=null;
	   try {
		   Driver dri=new Driver();
		   DriverManager.registerDriver(dri);
		   
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
	   
		   Statement stmt=con.createStatement();
		   
	      ResultSet res=stmt.executeQuery("select * from students_info;");
	      while(res.next()) {
	    	  System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
	      }
	   }
	   catch (Exception e) {
		   
	}
	   finally {
		System.out.println("=====closing the connection====");
		con.close();
	}
	}

}
