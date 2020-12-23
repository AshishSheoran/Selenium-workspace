package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_ExpectedConditions {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
		String alertMessage = "";

		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();

		// "alertIsPresent" - to check if their is an alert box.
		if (myWaitVar.until(ExpectedConditions.alertIsPresent()) != null) {
			System.out.println("Alert is present!");
		}

		// Will automatically switch to the alert box and accept the alert.
		driver.switchTo().alert().accept();

		System.out.println(alertMessage);

		// "navigate().to()" - will navigate our page to the given url
		driver.navigate().to("http://www.facebook.com");

		// "elementToBeClickable" - Waits until an element is visible and, at the same
		// time, enabled.
		WebElement createAccountButton = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("u_0_2")));
		createAccountButton.click();
		// driver.quit();

	}
}
