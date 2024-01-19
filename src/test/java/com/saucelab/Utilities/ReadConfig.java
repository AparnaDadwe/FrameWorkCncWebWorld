package com.saucelab.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties props;
	
	String path="D:\\Eclipse Workspace\\FrameWorkCncWebWorld\\Configuration\\Config.properties";
	
	//create constructor of class ReadConfig()
	
	public ReadConfig() 
	{
		
		try {
			props = new Properties();
			
			FileInputStream fis=new FileInputStream(path);
			
			props.load(fis);
		    } 
		catch (Exception e) 
		{
		System.out.println("File not found");
		e.printStackTrace();
		}
		
	}
	
	//method for read key value from properties file (config.properties file)
	
	public String getUrl() {
		String baseUrl=props.getProperty("url");
		
		//check value present in properties file or not
		
		if(baseUrl!=null) 
		
		return baseUrl;
		
		else
			
			throw new RuntimeException("Url value  is not defined in the property file");
		
	}
	
	//method for read key value of browser from properties file (config.properties file)
	
		public String getBrowser() {
			
			String browserValue=props.getProperty("browser");
			
			//check value present in properties file or not
			
			if(browserValue!=null) 
			
			return browserValue;
			
			else
				
				throw new RuntimeException("Browser value is not defined in the property file");
			
		}

}
