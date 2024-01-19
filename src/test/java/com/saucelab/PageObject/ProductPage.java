package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement productItemLink;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement shoppingCartLink;
	
	public void clickOn_productItemLink() {
		productItemLink.click();
	}
	
	public void clickOn_addToCartBtn() {
		addToCartBtn.click();
	}
	
	public void shoppingCartLink() {
		shoppingCartLink.click();
	}
	

}
