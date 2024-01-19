package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInformationPage {
	
     WebDriver driver;
	
	 public CheckOutInformationPage(WebDriver driver) 
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//input[@id='first-name']")
	 WebElement first_name;
	 
	 @FindBy(xpath="//input[@id='last-name']")
	 WebElement last_name;
	 
	 @FindBy(xpath="//input[@id='postal-code']")
	 WebElement postal_code;
	 
	 @FindBy(xpath="//input[@id='continue']")
	 WebElement continue_input_box;
	 
	 public void enter_first_name(String firstName) {
		 first_name.sendKeys(firstName);
	 }
	 
	 public void enter_last_name(String lastName) {
		 last_name.sendKeys(lastName);
	 }
	 public void enter_postal_code(String postalCode) {
		 postal_code.sendKeys(postalCode);
	 }
	
	 public void clickOn_continue_input_box() {
		 continue_input_box.click();
	 }
	
	 public String getCurrentUrl() {
		return driver.getCurrentUrl();
	 }
}
