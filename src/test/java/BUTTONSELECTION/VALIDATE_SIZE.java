package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VALIDATE_SIZE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://makemytrip.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    System.out.println("BEFORE CLICKING ON GOA LINK BUTTON, HOW MANY GOA LINK BUTTONS ARE PRESENT THERE?????");
	    System.out.println(driver.findElements(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).size());
	    driver.findElement(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).click();
	    System.out.println("AFTER CLICKING ON GOA LINK BUTTON,HOW MANY GOA LINK BUTTONS ARE STILL PRESENT THERE?????");
	    System.out.println(driver.findElements(By.xpath("//li[@class='dt__tags dest_tags']/parent::ul/li[3]")).size());
	
	
	}

}
