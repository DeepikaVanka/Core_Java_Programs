package mar14_Validate_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Login {

	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SpecBen.SPDVSup.No.On@optum.acet.test.auto.QA");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ACETTestUserOM6I8Bsf!");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	Thread.sleep(5000);
	String Errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
	System.out.println("The Error Message is :: "+Errormessage);
	driver.quit();
	}
}
