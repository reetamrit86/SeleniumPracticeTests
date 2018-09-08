package ELEMENTLOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHREGULARExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://login.salesforce.com/");
	 // driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("abc");
	//  driver.findElement(By.cssSelector("input[id*='user']")).sendKeys("xyz");
	 // driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("awesome");
	  driver.findElement(By.cssSelector("input[class*='username']")).sendKeys("excellent");
	}

}
