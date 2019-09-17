package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	
	
	public WebDriver getdriver(){
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-infobars");
		
		
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver 2");
		driver = new ChromeDriver(Options);
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
		
	}

}
