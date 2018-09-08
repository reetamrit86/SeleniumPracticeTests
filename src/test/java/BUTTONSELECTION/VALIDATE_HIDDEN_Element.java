package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VALIDATE_HIDDEN_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("http://makemytrip.com");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   System.out.println("BEFORE CLICKING ON MULTICITY RADIO BUTTON,MULTICITY RADIO BUTTON IS VISIBLE");
	   System.out.println(driver.findElement(By.id("multicity")).isDisplayed());
	   driver.findElement(By.id("multicity")).click();
	   System.out.println("AFTER CLICKING ON MULTICITY RADIO BUTTON, MULTICITY RADIO BUTTON IS NOT VISIBLE");
	   System.out.println(driver.findElement(By.id("multicity")).isDisplayed());
	}

}
