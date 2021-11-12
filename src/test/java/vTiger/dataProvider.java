package vTiger;

import org.testng.annotations.Test;

public class dataProvider {

	
	@org.testng.annotations.DataProvider
	public Object[][] sendData(){
		Object[][] ob=new Object[3][2];
		ob[0][0]="acc1";
		ob[0][1]="98";
	
		ob[1][0]="acc71";
		ob[1][1]="983";
		
		ob[2][0]="acc61";
		ob[2][1]="986";
		
		return ob;
	
	}
	@Test(dataProvider="sendData")
	public void getData(String name,String balance)
	{
		System.out.println("name osf the account holder :"+name+" Balance :"+balance);
	}
}
