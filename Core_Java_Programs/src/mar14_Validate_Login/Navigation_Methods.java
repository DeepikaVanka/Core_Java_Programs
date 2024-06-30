package mar14_Validate_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		System.out.println("The Page Title:: "+ driver.getTitle());
		Thread.sleep(3000);
		System.out.println("===============================================");
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("The Current URL:: "+driver.getCurrentUrl()+"The Title of the page: "+driver.getTitle());
		Thread.sleep(5000);
		System.out.println("===============================================");
		driver.navigate().back();
		System.out.println("The Current URL:: "+driver.getCurrentUrl()+"The Title of the page: "+driver.getTitle());
		Thread.sleep(3000);
		System.out.println("===============================================");
		driver.navigate().forward();
		System.out.println("The Current URL:: "+driver.getCurrentUrl()+"The Title of the page: "+driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
	}

}
