package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Form {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://www.facebook.com";
		
		driver.get(baseUrl);
		
		WebElement emailField = driver.findElement(By.id("email"));
		
		WebElement passField = driver.findElement(By.name("pass"));
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		// Sending values to the testBox 
		emailField.sendKeys("useremail@gmail.com");
		passField.sendKeys("userPassword");
		System.out.println("Text Field set!");
		
		// Deleting values from the text boxes
		emailField.clear();
		passField.clear();
		System.out.println("Text boxes cleared!");
		
		// Using click() method to submit form
		emailField.sendKeys("useremail@gmail.com");
		passField.sendKeys("userPassword");
		loginButton.click();
		System.out.println("Login done with Click()!");
		
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("useremail@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("userPassword");
		driver.findElement(By.name("login")).submit();
		System.out.println("Login Done with Submit()!");
		
	        driver.close();

	}

}
