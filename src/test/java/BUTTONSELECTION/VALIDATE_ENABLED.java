package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VALIDATE_ENABLED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://makemytrip.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    System.out.println("BEFORE CLICKING ON GOA LINK BUTTON, IS GOA LINK BUTTON ENABLED");
	    System.out.println(driver.findElement(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).isEnabled()); 
	    driver.findElement(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).click();
	    System.out.println("AFTER CLICKING ON GOA LINK BUTTON,IS GOA LINK BUTTON STILL ENABLED?????");
	    System.out.println(driver.findElement(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).isEnabled());
	
	
	
	}

}
