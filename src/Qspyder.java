import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.Challenge;

public class Qspyder {
	static{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			
		driver.get("file:///D:/selenium%20qspyder/demo1.html");
		driver.findElement(By.xpath("//button[.='Click me 1']")).click();
		driver.switchTo().frame("demo-frame3");
		
		driver.findElement(By.xpath("//input[@id='textbox1']")).sendKeys("Kamal");
		driver.switchTo().frame("demo-frame1");
		
		driver.findElement(By.id("ftb1")).sendKeys("FirstName");
		driver.findElement(By.id("ftb2")).sendKeys("LastName");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("demo-frame2");
		
		driver.findElement(By.id("frmbtn3")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//button[.='Click me 2']")));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[.='Click me 2']")).click();
		
		
		//driver.close();

	}

}
