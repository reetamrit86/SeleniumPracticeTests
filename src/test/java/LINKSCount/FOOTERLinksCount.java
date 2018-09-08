package LINKSCount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FOOTERLinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ebay.com");
	   driver.manage().window().maximize();
	   WebElement footer=driver.findElement(By.id("glbfooter"));
	   System.out.println("TOTAL NO. OF LINKS FOUND IN FOOTER IS:");
	   System.out.println(footer.findElements(By.tagName("a")).size());
	   WebElement column=footer.findElement(By.xpath(" //body/div/footer/div/table/tbody/tr/td[2]"));
	                      //OR
	                     //driver
	   System.out.println("TOTAL NO. OF LINKS FOUND IN GIVEN COLUMN IS:");
	   System.out.println(column.findElements(By.tagName("a")).size());
	  driver.findElement(By.linkText("See all companies")).click();
	   //OR
	  //footer
	
	}

}
