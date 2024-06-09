package mar13_validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commonds {
 static WebDriver driver= null;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(3000);
		String gmailtext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		
		String url= driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(url);
		driver.quit();
	}
	
}
