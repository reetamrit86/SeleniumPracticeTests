package WAITtypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLICITwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL&");
	 
	  Actions a=new Actions(driver);
	//  a.moveToElement(driver.findElement(By.xpath("//body/div/form/div/div/div/aside/div/div/fieldset/div/div/div/label/input"))).click().sendKeys("marriott").build().perform();
	
	  a.moveToElement(driver.findElement(By.id("H-destination"))).click().sendKeys("brooklyn").build().perform();
	  a.moveToElement(driver.findElement(By.id("H-destination"))).sendKeys(Keys.ENTER).build().perform();
	 WebDriverWait wait=new WebDriverWait(driver,3);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div/form/div/div/div/section/div/div/section/article/div/div/a")));
	   driver.findElement(By.xpath("//body/div/form/div/div/div/section/div/div/section/article/div/div/a")).click();
	
	
	}

}
