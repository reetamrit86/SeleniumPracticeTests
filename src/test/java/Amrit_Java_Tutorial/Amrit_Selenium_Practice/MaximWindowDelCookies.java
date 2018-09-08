package Amrit_Java_Tutorial.Amrit_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximWindowDelCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SUKHMANI\\\\Desktop\\\\ChromeDriver\\\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteCookieNamed("abc");
	      driver.manage().deleteAllCookies();
	      driver.get("https://www.google.com");
	      driver.close();
	
	}

}
