package BUTTONSELECTION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOSUGGESTIVEDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ksrtc.in");
	   driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   Thread.sleep(1000);
	   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   Thread.sleep(1000);
	   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   Thread.sleep(1000);
	   //driver.findElement(By.id("(fromPlaceName)[2]")).click();
	   driver.findElement(By.id("fromPlaceName")).getText();
	}

}
