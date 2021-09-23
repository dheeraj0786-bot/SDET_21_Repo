package com.comcast.createContactTest;

import org.testng.annotations.Test;

public class CreateContactTest {
	
		@Test(groups="smokeTest")
		public void createContactTest()
		{
			System.out.println("execute createContact");
		}
		
		
		@Test(groups="regionalTest")
		public void createContactwithOrgTest()
		{
			System.out.println("createContactwith");
		}
		
		
		@Test(groups="regionalTest")
		public void deleteContactTest()
		{
			System.out.println("createContact");
		}


}
