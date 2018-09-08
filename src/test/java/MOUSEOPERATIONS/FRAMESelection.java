package MOUSEOPERATIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FRAMESelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.jqueryui.com/droppable/");	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		Actions a=new Actions(driver);
	//	a.moveToElement(driver.findElement(By.xpath("//div[@id=\'draggable\']"))).doubleClick().build().perform();
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\'draggable\']"));
	    WebElement target=driver.findElement(By.xpath("//div[@id=\'droppable\']"));
	    a.dragAndDrop(source, target).build().perform();	
	}

}
