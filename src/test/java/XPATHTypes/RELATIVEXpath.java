package XPATHTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RELATIVEXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.qaclickacademy.com/interview.php");	
	  //RELATIVE XPATH
	  driver.findElement(By.xpath("//li[@id=\"tablist1-tab2\"]")).click();
	
	  // ABSOLUTE XPATH
		/* driver.get("https://www.amazon.com/");	
		 Actions a=new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("//body/div/header/div/div/div/div/form/div/div/input"))).click();//.keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	
	*/
	}

}
