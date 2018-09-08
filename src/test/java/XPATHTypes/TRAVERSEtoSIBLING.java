package XPATHTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRAVERSEtoSIBLING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.qaclickacademy.com/interview.php");	
	   driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
	
	}

}
