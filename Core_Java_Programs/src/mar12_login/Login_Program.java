package mar12_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Program {
	static WebDriver driver= null;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		//driver.quit();
	}

}
