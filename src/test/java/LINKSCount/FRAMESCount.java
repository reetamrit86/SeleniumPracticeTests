package LINKSCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRAMESCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKHMANI\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.jqueryui.com/droppable/");
	   System.out.println("TOTAL NO. OF FRAMES FOUND IS:");
	   System.out.println(driver.findElements(By.tagName("iframe")).size());
	
	}

}
