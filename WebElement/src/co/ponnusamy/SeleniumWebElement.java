package co.ponnusamy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Ponnusamy\\SeleniumTutorials\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(4000);
		driver.findElement(By.className("nav-right")).click();
		driver.findElement(By.linkText("POCO")).click();
		driver.navigate().to("http://edureka.co/blog");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
