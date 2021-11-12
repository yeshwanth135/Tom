package vTiger;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=0)
	public void priority() {
		System.out.println("priority");
	}
		@Test(priority=1 , dependsOnMethods = "priority")
		public void capacity() {
			System.out.println("capacity");
			
		}
		@Test(priority=0 , enabled=true)
		public void publiity() {
			System.out.println("publicity");
		}
			@Test(priority=2)
			public void cat() {
				System.out.println("cat");
			}
			@Test(priority=4 , invocationCount = 5)
			public void dog() {
				System.out.println("dog");
			}
		
		
	

}
