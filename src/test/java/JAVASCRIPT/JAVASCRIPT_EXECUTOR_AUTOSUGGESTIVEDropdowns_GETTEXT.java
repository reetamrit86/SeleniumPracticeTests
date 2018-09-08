package JAVASCRIPT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVASCRIPT_EXECUTOR_AUTOSUGGESTIVEDropdowns_GETTEXT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ksrtc.in");
	   driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	   Thread.sleep(1000);
	   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   Thread.sleep(1000);
	   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   Thread.sleep(1000);
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   //System.out.println(js.executeScript("return document.getElementById(\"fromPlaceName\").value;"));
	   //OR
	   String script="return document.getElementById(\"fromPlaceName\").value;";
	   String execution=(String) js.executeScript(script);
	   System.out.println(execution);
	}

}
