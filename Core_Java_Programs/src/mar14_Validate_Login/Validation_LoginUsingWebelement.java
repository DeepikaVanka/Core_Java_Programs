package mar14_Validate_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_LoginUsingWebelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://login.salesforce.com/");
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.click();
		Username.sendKeys("SpecBen.SPDVSup.No.On@optum.acet.test.auto.QA");
		String Usertext= Username.getAttribute("value");
		System.out.println("Username :: "+Usertext);
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='password']"));
		Password.click();
		Password.sendKeys("ACETTestUserOM6I8Bsf!");
		String Passtext = Password.getAttribute("value");
		System.out.println("Password:: "+Passtext);
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		
		String Expected= "dashboard";
		String Actual= driver.getCurrentUrl();
		if (Expected.contains(Actual)) {
			System.out.println("User Sucessfully Landed on Dashboard");
		}
		else {
			String Errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
			System.out.println("The Error Message is :: "+Errormessage);
			System.out.println("User failed to Login");
		}
		driver.quit();

	}

}
