package com.comcast.createContactTest;

import org.testng.annotations.Test;

public class CreateContactTest {
	
		@Test(groups="smokeTest")
		public void createContactTest()
		{
			String BROWSER=System.getProperty("browser");
			String URL=System.getProperty("url");
			System.out.println("execute createContact");
			System.out.println(BROWSER);
			System.out.println(URL);
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
