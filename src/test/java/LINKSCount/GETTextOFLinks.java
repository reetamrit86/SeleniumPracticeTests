package LINKSCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTextOFLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ebay.com");
	   driver.manage().window().maximize();
	   WebElement footer=driver.findElement(By.id("glbfooter"));
	   System.out.println("TOTAL NO. OF LINKS FOUND IN FOOTER IS:");
	   System.out.println(footer.findElements(By.tagName("a")).size());
	   int count=footer.findElements(By.tagName("a")).size();
	 //  System.out.println("Text );
	   for(int i=0;i<count;i++)
	   {
		   System.out.println("Text of Element Number:");System.out.println(i);System.out.println(" is:");
	      System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
	   
	   }
	
	
	}

}
