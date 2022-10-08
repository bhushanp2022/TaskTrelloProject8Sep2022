package com.TaskTrello.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//WebElement finding
	@FindBy(xpath="//input[@id='user']")
	private WebElement EmaiID;
	
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement ContinueButton;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement LogInButton;
	
	//Action on WebElement
	public void EnterEmailID() {
		
		EmaiID.sendKeys("bhushanp0711@gmail.com");
		
		
	}
	
	public void ClickContinueButton() {
		
		ContinueButton.click();
	}
	
	public void EnterPassword()
	{
		password.sendKeys("Trello@1234");
	}
	
	public void ClickLoginButton() {
		
		LogInButton.click();
		
		
	}
	
	

}
