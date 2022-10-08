package com.TaskTrello.POMClasses;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
	
	
	
WebDriver driver;
	
	public BoardPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//WebElement For Board Creation 
	@FindBy(xpath="//span[text()='Create new board']")
	private WebElement CreateNewBoard;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement EnterBoardtitle;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement CreateButton;
	
	
	//WebElement for List Creation
	@FindBy(xpath="//div[text()='Practice1']")
	private WebElement Practice1;

	@FindBy(xpath="//span[@class='icon-sm icon-add']")
	private WebElement AddListButton;

	@FindBy(xpath="//input[@placeholder= 'Enter list title…']")
	private WebElement EnterListName;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement finalAddListButton;
	
	//WebElemets for Add Card
	
	@FindBy(xpath="(//span[text()='Add a card'])[1]")
	private WebElement AddCardButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a title for this card…']")
	private WebElement EnterTitleOfCard;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/main/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/input")
	private WebElement FinalAddCardButton;
	
	
	//WebElement for finding X & Y cordinates
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/main/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/a/div[3]/span")
	private WebElement XYZcard;
	
	
	
	
	//Methods For Board Creation
	public void ClickCreateNewBoard() {
		
		CreateNewBoard.click();
		
	}
	
	
	
	public void EnterBoardtitle() {
		
		EnterBoardtitle.sendKeys("Practice1");
		
		
	}
	
	public void clickCreateButton() {
		
		CreateButton.click();
		
	}
	
	
  //Methods For List Creation
	public void ClickPractice1Board() {
		
		
		Practice1.click();
		
	}
	
	public void ClickAddListButton() {
		
		AddListButton.click();
		
	}
	
	public String EnterListName(String list) {
		
		EnterListName.sendKeys(list);
		return list;
		
	}

public void ClickFinalAddListButton() {
		
	finalAddListButton.click();
		
	}



//methods for add card

public void ClickAddCardButton() {
	AddCardButton.click();
	
}

public String EnterTitleOfCard(String CardTitle) {
	
	EnterTitleOfCard.sendKeys(CardTitle);
	return CardTitle;
	
}

public void clickFinalAddCardButton() {
	
	FinalAddCardButton.click();
}

//method for X & Y  cordinates


public void XYZBoard() {
	
	
Point p	=XYZcard.getLocation();

System.out.println("Position of X point is: " + p.getX());
System.out.println("Position of Y point is: " + p.getY());	
}


	
	
}
