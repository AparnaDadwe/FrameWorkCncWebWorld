package com.saucelab.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.PageObject.AddToCartPage;
import com.saucelab.PageObject.CheckOutCompletePage;
import com.saucelab.PageObject.CheckOutInformationPage;
import com.saucelab.PageObject.CheckOutOverviewPage;
import com.saucelab.PageObject.LogOutPAge;
import com.saucelab.PageObject.LoginPage;
import com.saucelab.PageObject.ProductPage;

public class RegressionTestCases extends BaseClass {
    @Test 
	public void verifyEndToEnd_LoginTo_ProceedToCheckOut() throws IOException 
    {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickOnLoginBtn();
		
		String title=driver.getTitle();
		System.out.println("Login Page Title is :" + title);
		
		if(title.equals("Swag Labs")) 
		{
			Assert.assertTrue(true);
			
		}
		
		else 
		{
			captureScreenShot(driver, "verify_login_title");
			Assert.assertTrue(false);
		}
		
		//code for product page to add to cart item
		
		ProductPage productPage=new ProductPage(driver);
		productPage.clickOn_productItemLink();
		productPage.clickOn_addToCartBtn();
		String productPageUrl=driver.getCurrentUrl();
		System.out.println("Product Page Url is :" + productPageUrl);
		
		if(productPageUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4")) 
		{
			Assert.assertTrue(true);
			
		}
		
		else 
		{
			captureScreenShot(driver, "verify_productPage_url");
			Assert.assertTrue(false);
		}
		
		//code for 
		productPage.shoppingCartLink();
		AddToCartPage cartPage=new AddToCartPage(driver);
		
		if(cartPage.get_textInventoryItemName().equals("Sauce Labs Backpack"))
		{
			Assert.assertTrue(true);
			cartPage.clickOn_checkOutBtn();
			
		}
		
		else 
		{
			captureScreenShot(driver, "verify_textInventoryItemName");
			Assert.assertTrue(false);
		}
		//code for CheckoutInformation Page
		CheckOutInformationPage ckInformationPage=new CheckOutInformationPage(driver);
		System.out.println("CheckOut Page Url is :" + ckInformationPage.getCurrentUrl());
		if(ckInformationPage.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-one.html"))
		{
			
			Assert.assertTrue(true);
			
			
		}
		
		else 
		{
			captureScreenShot(driver, "verify_informationPage_url");
			Assert.assertTrue(false);
		}
		
		ckInformationPage.enter_first_name("Aparna");
		ckInformationPage.enter_last_name("Dadwe");
		ckInformationPage.enter_postal_code("123456");
		ckInformationPage.clickOn_continue_input_box();
		
		String overviewPageUrl=driver.getCurrentUrl();
		System.out.println("Product Page Url is :" + overviewPageUrl);
		
		if(overviewPageUrl.equals("https://www.saucedemo.com/checkout-step-two.html")) 
		{
			Assert.assertTrue(true);
			
		}
		
		else 
		{
			captureScreenShot(driver, "verify_overViewPage_url");
			Assert.assertTrue(false);
		}
		
		//Code foe checkout Overview page
		CheckOutOverviewPage overviewPage=new CheckOutOverviewPage(driver);
		overviewPage.clickOn_finishBtn();
		
		//code for checkout complete page 
		CheckOutCompletePage completePage=new CheckOutCompletePage(driver);
		
		System.out.println("The sucess message:" + completePage.getThankuText());
		
		if(completePage.getThankuText().equals("Thank you for your order!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("The sucess message is not displaying");
		}
		
		//code for log out page
		LogOutPAge logPage=new LogOutPAge(driver);
		logPage.clickOn_hamburgerButton();
		logPage.clickOn_logOutLink();
	}
}
