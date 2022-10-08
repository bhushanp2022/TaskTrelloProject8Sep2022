package com.TaskTrello.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	WebDriver driver;
	
public LogOutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//WebElements
@FindBy(xpath="//span[@title='Bhushan Pathak (bhushanpathak2)']")
private WebElement AccountButton;


@FindBy(xpath="//span[text()='Log out']")
private WebElement LogoutButton;

//Methods
public void ClickOnAccountButton() {
	
	AccountButton.click();
}

public void ClickLogoutButton() {
	
	LogoutButton.click();
	
}


}
