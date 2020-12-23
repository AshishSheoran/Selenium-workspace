package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Radio_CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		
		radio2.click();
		
		WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
		checkBox.click();
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-1"));
		if(checkBox1.isSelected()) {
			System.out.println("Checkbox is Toggled On!");
		}
		else {
			System.out.println("Checkbox is Toggled Off");
		}
		
		driver.quit();
	}

}
