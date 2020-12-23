package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_SwitchingFrames {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
		// To switch frames
		driver.switchTo().frame("classFrame");	
		
		// To find GUI link element by the exact text it displays.
		driver.findElement(By.linkText("Deprecated")).click();
		
		driver.close();
	}

}
