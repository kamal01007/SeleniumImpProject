import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement menMenu = driver.findElement(By.xpath("//a[.='Men']"));
		act.moveToElement(menMenu).perform();
		Thread.sleep(5000);
		//List<WebElement> manHeading = driver.findElements(By.xpath("//a[@class='desktop-categoryName']"));
		
		List<WebElement> manHeading = driver.findElements(By.xpath("//a[.='Men']/../div/div/div/li/ul/li/a[@class='desktop-categoryName']"));
		for(WebElement e : manHeading)
		{
			if(e.isDisplayed())
			{
				System.out.println(e.getText());
			}
		}
		
	}
}
