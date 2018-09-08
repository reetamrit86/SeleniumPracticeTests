package WINDOWHANDLING;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MULTIPLE_WINDOW_HANDLING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 //  driver.get("https://accounts.google.com/signup");
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	   System.out.println(driver.getTitle());
	 //  driver.findElement(By.xpath("//div[contains(@class,'IMH1vc')]")).click();
	   driver.findElement(By.linkText("privacy policy")).click();
	   Set<String> ids=driver.getWindowHandles();
	   Iterator<String> itr=ids.iterator();
	   String parentid=itr.next();
	   String childid=itr.next();
	   System.out.println("CHILD WINDOW TITLE IS:");
	   driver.switchTo().window(childid);
	   System.out.println(driver.getTitle());
	   System.out.println("PARENT WINDOW TITLE IS:");
	   driver.switchTo().window(parentid);
	   System.out.println(driver.getTitle());
	}

}
