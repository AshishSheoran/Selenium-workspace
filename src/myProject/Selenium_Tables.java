package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// To access data from a table
//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();

		// To retrieve text from nested tables
//		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
//		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();

		// To retrieve text from table using attributes as Predicates
		driver.get("http://demo.guru99.com/test/newtours/");
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		
		System.out.println(innerText);
		driver.quit();
	}

}
