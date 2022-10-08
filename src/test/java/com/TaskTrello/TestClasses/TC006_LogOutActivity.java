package com.TaskTrello.TestClasses;

import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.LogOutPage;

public class TC006_LogOutActivity extends TestBaseClass{
 
	@Test
	public void Logout() {
		
		 LogOutPage logout=new LogOutPage(driver);
		 
		 logout.ClickOnAccountButton();
		 logout.ClickLogoutButton();
		 
		
	}
	
	
	
}
