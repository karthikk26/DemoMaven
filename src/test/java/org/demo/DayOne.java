package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoMaven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
		//Browser launch
		
		//Locators - id, name, classname, xpath, css selectors
		//tagname ------ input, text, div, a, span
		//attribute name ----- id , name
		//attribute value ----
		
		// Webelement
		
		
		
	}

}
