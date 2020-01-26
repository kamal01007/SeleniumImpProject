import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonFlipkartMyntra {
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		
		
	}

}
