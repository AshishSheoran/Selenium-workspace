package myProject;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;	-uncomment while using chrome
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {
	public static void main(String[] args) {

		// Declaration and instantiation of objects/variables for firefox.
		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// Declaration and instantiation of objects/variables for chrome
//		System.setProperty("webdriver.chrome.driver", "/Users/ashu/chromedriver");
//		Webdriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		// launch firefox and direct it to the base URL
		driver.get(baseURL);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		// Compare the actual title of the page with the expected one and print
		// The result as "Passed" or "Failed"
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		// close the browser(firefox)
		driver.close();
	}

}
