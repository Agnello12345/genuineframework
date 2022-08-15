package com.crm.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationTest 
{
	@Test
	public void createOrganizationTest() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\genuinerepo\\com.crm.autovtiger\\src\\test\\resources\\Data.properties");
//	    Properties prop = new Properties();
//	    prop.load(fis);
	    //String url = prop.getProperty("url");
		String URL=System.getProperty("url");
	    System.out.println(URL);
	    driver.get(URL);
	    System.out.println("execution done");
	    System.out.println("Execution in jenkins poll SCM mode is done");
	
	
	}

}
