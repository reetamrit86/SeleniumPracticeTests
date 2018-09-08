package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHECKBoxSELECTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("http://www.spicejet.com/");	
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
	 System.out.println((driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected()));
	 
	
	
	}

}
