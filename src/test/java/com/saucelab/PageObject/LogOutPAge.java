package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPAge {
	
     WebDriver driver;
	
	public LogOutPAge(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    WebElement hamburgerButton;
    
    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    WebElement logOutLink;

    public void clickOn_hamburgerButton() {
    	hamburgerButton.click();
    }
    
    public void clickOn_logOutLink() {
    	logOutLink.click();
    }
}
