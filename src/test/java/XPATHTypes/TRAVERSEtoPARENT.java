package XPATHTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRAVERSEtoPARENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.qaclickacademy.com/interview.php");	
	   driver.findElement(By.xpath("//li[@id=\'tablist1-tab3\']/parent::ul/li[4]")).click();
	
	
	
	}

}
