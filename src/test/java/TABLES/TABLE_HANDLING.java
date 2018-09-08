package TABLES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLE_HANDLING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20077/csk-vs-rr-17th-match-indian-premier-league-2018");
	   driver.manage().window().maximize();
	   WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	   int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
	   System.out.println(count);
	   int sum=0;
	   for(int i=0;i<count-2;i++)
	   {
		   String value=driver.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
		   int intvalue=Integer.parseInt(value);
		   sum=sum+intvalue;
	   }
	   String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[2]")).getText();
	   int intextra=Integer.parseInt(extra);
	   sum=sum+intextra;
	   System.out.println("Sum of Total runs made is:");
	   System.out.println(sum);
	   
	   String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[2]")).getText();
	   int inttotal=Integer.parseInt(total);
	   System.out.println("total is:"+inttotal);
	   
	   if(sum==inttotal)
		   System.out.println("count matched");
	   else
		   System.out.println("count not matched");
	}

}
