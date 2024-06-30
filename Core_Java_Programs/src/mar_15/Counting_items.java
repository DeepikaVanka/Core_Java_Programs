package mar_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Counting_items {

	public static void main(String[] args) throws Throwable {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.in");
    Thread.sleep(5000);
    Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
    
    //get collection of items in listbox
    List<WebElement> All_items= listbox.getOptions();
    System.out.println("The No of items in the list :: "+All_items.size());
    for (WebElement Eachitem : All_items) { 	
		System.out.println("Items in the list:: "+Eachitem.getText());
	}
    driver.quit();
	}

}
