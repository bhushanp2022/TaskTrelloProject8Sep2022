package com.TaskTrello.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.BoardPage;
import com.TaskTrello.POMClasses.LoginPage;

public class TC001_CreateBoard extends TestBaseClass{


	@Test
	public void CreateBoard() throws InterruptedException {
		
		BoardPage bp=new BoardPage(driver);
	    bp.ClickCreateNewBoard();
	    Thread.sleep(2000);
		bp.EnterBoardtitle();
		bp.clickCreateButton();
		
		
		
		
		
		
		
		
		
		
	}
}
