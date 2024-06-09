package mar13_validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comparision_Title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(3000);
		String Expected= "Google";
		String Actual= driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("The Title is Matching");
		}
		else {
			System.out.println("The title is not matching");
		}
		driver.quit();

	}

}
