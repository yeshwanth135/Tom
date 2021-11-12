package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class verifytheTables {
	
	
	@Test
	public void executeupdate() throws Throwable {
	String expecteddata="ram";
	Driver dri=new Driver();
	DriverManager.registerDriver(dri);
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery("select firstname from students_info where firstname='ram';");
	boolean flag=false;
	while(res.next()) {
		String actualdata=res.getString(1);
		if(actualdata.equals(expecteddata)) {
			System.out.println(expecteddata+ " is present");
			flag=true;
			break;
		}
		else {
			System.out.println(expecteddata+" is not present");
		}
	}
	}
}
