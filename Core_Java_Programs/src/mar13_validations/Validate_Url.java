package mar13_validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(3000);
		String Expected ="gmail";
		String Actual= driver.getCurrentUrl();
		if (Actual.startsWith(Expected)) {
			System.out.println("Url is secured");
		}
		else {
			System.out.println("Url is local");
		}
		driver.quit();

	}

}
