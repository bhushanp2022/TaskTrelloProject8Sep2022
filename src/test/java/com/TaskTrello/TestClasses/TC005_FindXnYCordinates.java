package com.TaskTrello.TestClasses;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.BoardPage;

public class TC005_FindXnYCordinates extends TestBaseClass{
	
	
	@Test
	public void XnYcordinates() {
		
		BoardPage bp=new BoardPage(driver);
		bp.ClickPractice1Board();
	     bp.XYZBoard();
	     
	   
		
	}

}
