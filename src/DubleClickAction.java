import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DubleClickAction {
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("file:///D:/SELENIUM%2013%20Jan/DoubleClick.html");
		WebElement dblClckButton = driver.findElement(By.xpath("//button[.='Double-click me']"));

		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(dblClckButton).doubleClick().perform();
		
		act.moveToElement(dblClckButton).contextClick().perform();*/
		
		
		driver.get("file:///D:/SELENIUM%2013%20Jan/TestYantra%20Registration.html");
		
		WebElement langSelect = driver.findElement(By.id("langOne"));
		Select sct = new Select(langSelect);
		sct.selectByIndex(0);
		sct.selectByValue("3");
		sct.selectByVisibleText("Tamil");
		boolean langStatus = sct.isMultiple();
		if(langStatus == true)
		{
			System.out.println("Dropdown is multiselectable");
		}
		else
			System.out.println("drop down is not multi selectable");
		
		List<WebElement> allItems = sct.getAllSelectedOptions();
		for(WebElement l : allItems)
		{
			System.out.println(l.getText());
		}
		WebElement prgSelect = driver.findElement(By.id("langTwo"));
		
		Select sct1 = new Select(prgSelect);
		sct1.selectByIndex(0);
		sct1.selectByValue("3");
		sct1.selectByVisibleText("JavaScript");
		
	}

}
