package com.TaskTrello.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.TaskTrello.POMClasses.LoginPage;

public class TestBaseClass {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver106.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		  driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.EnterEmailID();
		lp.ClickContinueButton();
		Thread.sleep(2000);
		lp.EnterPassword();
		lp.ClickLoginButton();
		
		
	}

	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	
}
