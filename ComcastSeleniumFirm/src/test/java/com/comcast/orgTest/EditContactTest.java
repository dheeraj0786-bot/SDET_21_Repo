package com.comcast.orgTest;

import org.testng.annotations.Test;

public class EditContactTest {
		@Test(groups="smokeTest")
		public void clickAndEditTest()
		{
			System.out.println("click on edit and change org name");
		}
		
		@Test(groups="regionalTest")
		public void saveChangeTest(){
			System.out.println("click on save changes");
			
		}
		
		@Test(groups="regionalTest")
		public void editTest()
		{
			System.out.println("edited");
		}

	}


