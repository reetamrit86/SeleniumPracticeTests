package JAVASCRIPT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVASCRIPT_EXECUTOR_WITH_WHILE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ksrtc.in");
	   driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	   Thread.sleep(1000);
	   String text= driver.findElement(By.id("fromPlaceName")).getText(); 
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	 int i=0;
	 while(!text.equalsIgnoreCase("beng"))
	 {
		 ++i;
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 Thread.sleep(1000);
		 System.out.println(js.executeScript("return document.getElementById(\"fromPlaceName\").value;"));
		if(i>5)
			break;
	 }
	
	
	
	
	}

}
