package mar14_Validate_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='+91 ']")).sendKeys("9014034959");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
