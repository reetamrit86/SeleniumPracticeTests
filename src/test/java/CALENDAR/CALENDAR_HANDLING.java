package CALENDAR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CALENDAR_HANDLING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		   driver.get("https://www.path2usa.com/travel-companions");	
		   driver.findElement(By.id("travel_date")).click();
		   int count=driver.findElements(By.className("day")).size();
	       for(int i=0;i<count;i++)
	       {
	    	   String text=driver.findElements(By.className("day")).get(i).getText();
	    	   if(text.contains("23"))
	    	   {
	    		   driver.findElements(By.className("day")).get(i).click();
	    	       break;
	    	   }
	
	       }
	
	
	}

}
