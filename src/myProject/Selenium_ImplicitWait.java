package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Selenium_ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("sheoranashu1998@gmail.com");

		WebElement passField = driver.findElement(By.id("pass"));
		passField.sendKeys("jasonstatham");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='u_0_b']"));
		loginButton.click();

		// "implicitlyWait" will make the driver to wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();
	}

}
