package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
     
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkOutBtn;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement textInventoryItemName;
	
	//div[@class='inventory_item_name']
	
	public void clickOn_checkOutBtn() {
		checkOutBtn.click();
	}
	
	public String get_textInventoryItemName() {
		return textInventoryItemName.getText();
	}
}
