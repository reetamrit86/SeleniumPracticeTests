package Amrit_Java_Tutorial.Amrit_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PGSourceCurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SUKHMANI\\\\Desktop\\\\ChromeDriver\\\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com");
		// System.out.println(driver.getTitle());
		
		 
		 System.out.println(driver.getPageSource());
		 
		 System.out.println(driver.getTitle());
			
		 driver.get("https://www.yahoo.com/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		
		
		 driver.quit();	
	
	}

}
