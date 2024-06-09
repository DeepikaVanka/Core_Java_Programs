package mar7_webdriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Launch {
	static WebDriver driver= null;
	public static void main(String[] args) throws Throwable {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver= new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver= new EdgeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
