package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_MultipleActions {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");

		WebElement txtUserName = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUserName).click().keyDown(txtUserName, Keys.SHIFT)
				.sendKeys(txtUserName, "hello").keyUp(txtUserName, Keys.SHIFT).doubleClick(txtUserName).contextClick()
				.build();

		seriesOfActions.perform();

	}

}
