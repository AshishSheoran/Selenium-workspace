package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_LocatingElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		String baseUrl = "http://www.facebook.com";
		String tagName = "";

		driver.get(baseUrl);
		
		String source = driver.getPageSource();
		System.out.println(source);

		// To find a GUI element with id "email" on the webpage
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("usermail@gmail.com");
		
		WebElement passField = driver.findElement(By.id("pass"));
		passField.sendKeys("password");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		driver.close();
		System.exit(0);

	}

}
