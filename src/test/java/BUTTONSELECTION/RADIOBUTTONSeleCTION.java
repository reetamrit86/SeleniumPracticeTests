package BUTTONSELECTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADIOBUTTONSeleCTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("http://www.echoecho.com/htmlforms10.htm");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  
	   //*********FIRST METHOD**********
	  
	   // driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	 //  System.out.println((driver.findElement(By.xpath("//input[@value='Cheese']"))).isSelected());
	
	  //*********SECOND METHOD**********
	   
	   int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
	   for(int i=0;i<count;i++)
	   {
		   String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		   if(text.equals("Cheese"))
		   {
			   driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		      break;
		   }
	 }
	   
	
	
	}

}
