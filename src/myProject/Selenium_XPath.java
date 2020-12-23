package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_XPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/selenium-xpath.html");

		// xPath using the "Absolute Path"
		WebElement userIdField = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userIdField.sendKeys("ashu");

		// xPath using the "Relative Path"
		WebElement passField = driver.findElement(By.xpath("//input[@type='password']"));
		passField.sendKeys("jackSparrow");

		WebElement loginBtn = driver.findElement(By.xpath("//*[contains(@type, 'submit')]"));
		// By.xpath("//input[@type='submit' and @name='btnLogin']");
		loginBtn.click();
		
	}

}
