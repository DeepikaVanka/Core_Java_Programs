package mar14_Validate_Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_URL {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rediff.com");
		Thread.sleep(5000);
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		System.out.println("The Overall Links on the Page:: "+Links.size()); 
		for (WebElement Each : Links) {
			Thread.sleep(100);
			System.out.println(Each.getText());
		}
		driver.quit();
	}
}
