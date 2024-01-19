package com.saucelab.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.saucelab.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	String url=readConfig.getUrl();
	String browserName=readConfig.getBrowser();
	
   public static  WebDriver driver;
   
   @BeforeClass
   public void setUp()
   {
		if(browserName.equalsIgnoreCase("chrome")) {
//    		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	else if(browserName.equalsIgnoreCase("Edge")){
    		//System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
   		 driver =new EdgeDriver(); 
    	}
    	else if(browserName.equalsIgnoreCase("FireFox")) {
    		//System.setProperty("webdriver.firefox.driver", "driver/geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    	else {
    		System.out.print("No Supported browser found");
    	}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   
   @AfterClass
   public void tearDown() 
   {
	 //  driver.quit();
   }
   
 public static void captureScreenShot(WebDriver driver, String testCaseName) throws IOException
 {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File tar=new File(System.getProperty("user.dir") + "./ScreenShots/" + testCaseName + ".png");
	 FileUtils.copyFile(src, tar);
	 
 }
 
}
