package co.ponnusamy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Ponnusamy\\SeleniumTutorials\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//implicitywait
		
		//driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//input[@id= 'login-username']")).sendKeys("d.samy1505@yahoo.com");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		
		//Expilictywaits
		driver.get("https://www.facebook.com/r.php?entry_point=login/");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		sendKeys(driver, firstname, 10, "Ponnusamy");
		sendKeys(driver, lastname, 20, "D");
		
		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		clikOn(driver, forgotAccount, 10);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.quit();
		
}
	
	
	public static void sendKeys(WebDriver driver1 ,WebElement element , int timeout ,String value) {
		try {
	        // Wait for the element to be visible
	        new WebDriverWait(driver1, Duration.ofSeconds(timeout))
	            .until(ExpectedConditions.visibilityOf(element));
	        
	        // Send the keys to the element
	        element.sendKeys(value);
	    } catch (Exception e) {
	        System.out.println("Error while sending keys: " + e.getMessage());
	    }
	}
	
	public static void clikOn(WebDriver driver1 ,WebElement element , int timeout) {
		try {
	        // Wait for the element to be visible
	        new WebDriverWait(driver1, Duration.ofSeconds(timeout))
	            .until(ExpectedConditions.elementToBeClickable(element));
	        
	       
	    } catch (Exception e) {
	        System.out.println("Error while sending keys: " + e.getMessage());
	    }
	}
	
	
	

}

