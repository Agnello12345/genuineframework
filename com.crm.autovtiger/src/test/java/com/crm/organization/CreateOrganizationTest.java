package com.crm.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateOrganizationTest 
{
	@Test
	public void createOrganizationTest() throws Throwable
	{
		
		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\com.crm.autovtiger\\src\\test\\resources\\Data.properties");
	    Properties prop = new Properties();
	    prop.load(fis);
	    String url = prop.getProperty("url");
	    System.out.println(url);
	    driver.get(url);
	    System.out.println("execution done");
	
	
	}

}
