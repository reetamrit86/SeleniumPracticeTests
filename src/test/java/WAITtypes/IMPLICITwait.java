package WAITtypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IMPLICITwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		driver.get("https://alaskatrips.poweredbygps.com/Hotel-Search?#&destination=nyc&startDate=&endDate=&regionId=&adults=2");
	 
	  Actions a=new Actions(driver);
	//  a.moveToElement(driver.findElement(By.xpath("//body/div/form/div/div/div/aside/div/div/fieldset/div/div/div/label/input"))).click().sendKeys("marriott").build().perform();
	
	  a.moveToElement(driver.findElement(By.id("inpHotelNameMirror"))).click().sendKeys("marriott").build().perform();

	}

}
