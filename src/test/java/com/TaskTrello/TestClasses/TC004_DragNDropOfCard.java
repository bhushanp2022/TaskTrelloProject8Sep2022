package com.TaskTrello.TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskTrello.POMClasses.BoardPage;

public class TC004_DragNDropOfCard extends TestBaseClass{
	
	
	
	@Test
	public void dragNDrop() {
		
		BoardPage bp=new BoardPage(driver);
		bp.ClickPractice1Board();
		
		
	WebElement Source	=driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
	WebElement Destination=
			driver.findElement(By.xpath("(//div[@class='list-header-target js-editing-target'])[2]"));
	
	//Drag And Drop of Card
	Actions act=new Actions(driver);
	
	act.dragAndDrop(Source, Destination).perform();
	
	
	
		
	}

}
