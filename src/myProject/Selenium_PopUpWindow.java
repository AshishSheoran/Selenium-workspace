package myProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_PopUpWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("Click Here")).click();

		String mainWindow = driver.getWindowHandle();

		// To handle all new opened windows.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String childWindow = i1.next();
			if (!mainWindow.equalsIgnoreCase(childWindow)) {

				// Switching to Child Window
				driver.switchTo().window(childWindow);

				WebElement emailField = (new WebDriverWait(driver, 10))
						.until(ExpectedConditions.presenceOfElementLocated(By.name("emailid")));
				emailField.sendKeys("sheoranashu@outlook.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window
				driver.close();
			}
		}

		// Switching to Parent Window
		driver.switchTo().window(mainWindow);

		driver.close();

	}

}
