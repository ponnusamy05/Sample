package co.ponnusamy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alets {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Ponnusamy\\SeleniumTutorials\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement btnsignIn = driver.findElement(By.name("proceed"));
		btnsignIn.click();
		Thread.sleep(4000);
		
		//switch to alert
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		

}
}
