package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage {
	WebDriver driver;
	
	public CheckOutCompletePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement thankuText;
	
	public String getThankuText() {
		return thankuText.getText();
	}

}
