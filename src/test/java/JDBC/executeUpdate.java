package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class executeUpdate {

	@Test
	public void executeupdateTest() throws Throwable {
		Connection con=null;
		try {
			Driver dri=new Driver();
			DriverManager.registerDriver(dri);
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			Statement stmt=con.createStatement();
			
			int res=stmt.executeUpdate("insert into students_info (regno,firstname,middlename,lastname) values('6','suresh','gowda','r');");
			System.out.println(res);
			if(res==1)
			{
				System.out.println("data inserted into databases");
			}
			else {
				System.out.println("data not inserted into databases");
			}
		}
		catch (Exception e) {
			
		}
		finally {
			con.close();
		}
	}
}
