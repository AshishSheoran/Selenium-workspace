package myProject;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_DynamicTables {

	public static void main(String[] args) throws ParseException {

		System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String max;
		double m = 0, r = 0;
		// Find number of columns
		List col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Number of columns are: " + col.size());

		// Find number of Rows
		List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Number of rows are: " + rows.size());

		for(int i=1; i< rows.size();i++) {
			max= driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if(m>r) {
				r=m;
			}
		}
		System.out.println("Maximum current price is : " + r);
		
		/*
		 * // To get data from a specific row/column. WebElement baseTable =
		 * driver.findElement(By.tagName("table"));
		 * 
		 * // To find 3rd row of table WebElement tableRow =
		 * baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"
		 * )); String rowText = tableRow.getText();
		 * System.out.println("Third row of table : " + rowText);
		 * 
		 * // To get 3rd row's 2nd column data WebElement cellData =
		 * tableRow.findElement(By.xpath(
		 * "//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]")); String valueCell =
		 * cellData.getText(); System.out.println("Cell value is: " + valueCell);
		 */

		driver.close();
	}
}
