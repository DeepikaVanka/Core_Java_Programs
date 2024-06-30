package mar_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingListitem {

	public static void main(String[] args) throws Throwable {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.navigate().to("https://www.facebook.com/");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(5000);
    //Store three List Boxes into Select Class
    Select daylistbox= new Select(driver.findElement(By.name("birthday_day")));
    Select monthlist= new Select(driver.findElement(By.name("birthday_month")));
    Select yearlist= new Select(driver.findElement(By.name("birthday_year")));
    
    //Verify listbox is single or multi Selection
    boolean value= daylistbox.isMultiple();
    System.out.println(value);
    
    //Select items in Listbox
    daylistbox.selectByIndex(0);
    Thread.sleep(4000);
    monthlist.selectByVisibleText("Dec");
    Thread.sleep(5000);
    yearlist.selectByVisibleText("1975");
    Thread.sleep(5000);
    driver.quit();
    
	}

}
