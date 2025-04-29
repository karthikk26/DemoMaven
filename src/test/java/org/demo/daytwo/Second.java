package org.demo.daytwo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second{
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoMaven\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("kk@gmail.com");
	
	WebElement txtPassword = driver.findElement(By.name("pass"));
	txtPassword.sendKeys("123456");
	
		
	WebElement btnLogin=driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	
	WebElement txtmsg=driver.findElement(By.xpath("//div[contains(text(),'The password that ')]"));
	String text = txtmsg.getText();
	System.out.println(text);
	
	}
	
	}


