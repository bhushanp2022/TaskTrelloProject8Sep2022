package com.TaskTrello.TestClasses;

import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.BoardPage;

public class TC003_AddCardToList extends TestBaseClass{

	@Test
	public void AddCard() {
		
		BoardPage bp=new BoardPage(driver);
		bp.ClickPractice1Board();
		bp.ClickAddCardButton();
		bp.EnterTitleOfCard("XYZ");
		bp.clickFinalAddCardButton();
		
		
		
	}
	
	
}
