package MOUSEOPERATIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGandDROP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    Actions a=new Actions(driver);
	    WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	    a.dragAndDrop(source, target).build().perform();
	
	
	}

}
