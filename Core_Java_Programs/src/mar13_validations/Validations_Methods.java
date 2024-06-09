package mar13_validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations_Methods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tatacliq.com/");
		Thread.sleep(3000);
		String Page_Title= driver.getTitle();
		System.out.println(Page_Title);
		System.out.println(Page_Title.length());
		String strurl= driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.quit();
	}

}
