package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_SwitchingPopUpWindows {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "/Users/ashu/chromedriver");
		WebDriver driver = new ChromeDriver();

		String alertMessage = "";

		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		
		// Will automatically switch to the alert box and accept the alert.
		driver.switchTo().alert().accept();

		System.out.println(alertMessage);

		driver.quit();

	}

}
