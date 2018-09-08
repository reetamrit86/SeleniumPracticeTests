package MOUSEOPERATIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DOUBLECLICK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.com/");	
	   Actions a=new Actions(driver);
	   WebElement moveto= driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[2]"));
	  //a.moveToElement(moveto).build().perform();
	
	  //to type shoes in search box
	 //  a.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("shoes").build().perform();
	
	   //to select shoes by double click
	   //a.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("shoes").doubleClick().build().perform();
	   
	   //to right click
	 //  a.moveToElement(moveto).contextClick().build().perform();
	   
	   //to write shoes in capital
	   a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("shoes").build().perform();
	   
	}

}
