package LINKSCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PASSorFAIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ebay.com");
	   driver.manage().window().maximize();
	   WebElement footer=driver.findElement(By.id("glbfooter"));
	   WebElement column=footer.findElement(By.xpath(" //body/div/footer/div/table/tbody/tr/td[2]"));
	   int count=column.findElements(By.tagName("a")).size();
	   System.out.println(count);
	   String beforeclick=driver.getTitle();
	  
	   for(int i=0;i<count;i++)
	   {
		     String text=column.findElements(By.tagName("a")).get(i).getText();
		     if(text.contains("Mobile apps"))
		     {
		    	  System.out.println("Before click title");
		    	  System.out.println(driver.getTitle());
		    	  column.findElements(By.tagName("a")).get(i).click();
		    	 // String afterclick=driver.getTitle();
		    	  System.out.println("Title after Click");
		    	  System.out.println(driver.getTitle());
		          break;
		     }
	   }
	        String afterclick=driver.getTitle();
	        //System.out.println(driver.getTitle());
	        if(afterclick==beforeclick)
	        {
	        	System.out.println("Fail");
	        
	         }
	        else if((driver.getPageSource()).contains("Get the eBay app for iPhone"))
	        		System.out.println("PASS");
	         
	        
	          
	}

}
