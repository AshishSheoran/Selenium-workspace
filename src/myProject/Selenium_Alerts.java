package myProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement customerIdField = driver.findElement(By.xpath("//input[starts-with(@name,'cus')]"));
		// By.xpath("//*[@type='text' and @name='cusid']");
		// By.xpath("//input[starts-with(@name,'cus')]");
		customerIdField.sendKeys("12345");
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@type='text']//following::input[1]"));  // find the element following the input field
		submitBtn.click();
		// driver.findElement(By.name("submit")).submit();
		
		// Switching to alert
		Alert alert = driver.switchTo().alert();
		
		// Capturing the alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		// Displaying alert message
		System.out.println(alertMessage);
		
		// Accepting alert
		alert.accept();
	}

}
