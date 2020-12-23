package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_AccessingImangeLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ashu/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
		
		if(driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			System.out.println("We are on facebook home page");
		}
		else {
			System.out.println("We are NOT on facebook home page");
		}
		
		driver.close();

	}

}
