package ELEMENTLOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FINDBYclassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SUKHMANI\\\\Desktop\\\\ChromeDriver\\\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	     driver.findElement(By.className("gsfi")).sendKeys("songs");
	
	
	
	
	}

}
