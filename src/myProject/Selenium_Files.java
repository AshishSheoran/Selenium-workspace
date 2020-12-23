package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Files {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/upload/");

		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// Entering file path onto the file-selection input field
		uploadElement.sendKeys("/Users/ashu/Downloads/Cover Letter.docx");

		// Click the "Accept terms and conditions" button checkbox
		driver.findElement(By.id("terms")).click();

		// Click the "upload file" button
		driver.findElement(By.name("send")).click();

	}

}
