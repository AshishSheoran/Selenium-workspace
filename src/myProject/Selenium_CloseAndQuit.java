package myProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_CloseAndQuit {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/popuptest2.html");
		//driver.close();		// will close only the parent window.
		driver.quit();      // will close all the existing windows for the browser.
	}

}
