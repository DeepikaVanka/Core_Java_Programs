package mar_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {
	public static void main(String[] args) throws Throwable {
		String Item_Present ="babyies";
		boolean item_exit= false;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		Select Listbox =new Select(driver.findElement(By.id("searchDropdownBox")));

		List<WebElement> All_items= Listbox.getOptions();
		System.out.println("=========Presented Items listed Below======");
		System.out.println(All_items.size());
		for (WebElement Eachelement : All_items) {
			String Actual_item= Eachelement.getText();
			Thread.sleep(2000);
			System.out.println("Acutal Items :: "+Actual_item);
			if(Actual_item.equalsIgnoreCase(Item_Present)) {
				item_exit=true;
				break;
			}
		}
		if(item_exit) {
			System.out.println("Item Existed in the list box");
		}else {
			System.out.println("Item Not Existed in the list box");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}


