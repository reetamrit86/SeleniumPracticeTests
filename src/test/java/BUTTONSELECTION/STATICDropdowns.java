package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class STATICDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("http://www.spicejet.com/");
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	  // s.selectByIndex(3);
	 //  s.selectByValue("USD");
	    s.selectByVisibleText("AED");
	
	}

}
