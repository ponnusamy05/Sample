package co.ponnusamy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelection {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Ponnusamy\\SeleniumTutorials\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Guitar");	
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
