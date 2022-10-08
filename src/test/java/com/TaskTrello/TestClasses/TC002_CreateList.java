package com.TaskTrello.TestClasses;

import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.BoardPage;

public class TC002_CreateList extends TestBaseClass{
	
	
	@Test
	public void CreateList() throws InterruptedException {
		
	   
		BoardPage bp=new BoardPage(driver);
		
		bp.ClickPractice1Board();
		bp.ClickAddListButton();
		bp.EnterListName("A");
		Thread.sleep(2000);
		bp.ClickFinalAddListButton();
		
		bp.EnterListName("B");
		bp.ClickFinalAddListButton();
		
	}

}
