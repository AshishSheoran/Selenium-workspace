package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Conditions {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com");

		WebElement txtbox_username = driver.findElement(By.id("emailid"));
		if (txtbox_username.isEnabled()) { // "isEnabled" - to verify whether a certain a element is enabled or not.
			do {
				txtbox_username.sendKeys("tutorial");
			} while (driver.findElement(By.id("emailid")).isDisplayed()); // "isDisplayed" - to verify whether a certain
																			// element is displaed or not.
		}

		// "isSelected" - to verify whether a certain check box, radio button or option
		// in drop-down box is selected. it does not work on other elements
//		if(driver.findElement(By.id("one-way")).isSelected()) {
//			driver.findElement(By.id("two-way")).click();
//		}

		driver.close();
	}

}
