package org.demo.One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class First {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\DemoMaven\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	driver.quit();	
		}
}
