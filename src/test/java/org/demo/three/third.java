package org.demo.three;


	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class third {
		
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoMaven\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement txtFst = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtFst.sendKeys("Karthi");
				
		WebElement txtLst = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtLst.sendKeys("KK");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("No 14,vengadasamy street, selaiyur");
				
				
		}
		

}
