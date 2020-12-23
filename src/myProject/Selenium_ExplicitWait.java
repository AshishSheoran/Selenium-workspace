package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// These packages need to be imported for explicit wait
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_ExplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
		
		driver.get("http://www.facebook.com");
		
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("username");
		
	}

}
