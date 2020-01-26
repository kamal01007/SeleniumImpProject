import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement ggleSrchBx = driver.findElement(By.name("q"));
		ggleSrchBx.sendKeys("Java",Keys.ENTER);
		System.out.println(driver.findElement(By.linkText("Download Free Java Software")).getText());
	
	}

}
