package ALERTS;
//These
//are/
//java
//alerts
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http:\\aliexpress.com");
	    driver.switchTo().alert().getText();
	    driver.switchTo().alert().sendKeys("abc");
	    driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss(); 
	
	
	
	}

}
