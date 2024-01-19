package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public void enterUserName(String user_name) 
	{
		userName.sendKeys(user_name);
	}
	
	public void enterPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() 
	{
		loginButton.click();
	}

}
