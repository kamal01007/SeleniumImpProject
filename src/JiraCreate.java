import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JiraCreate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://maxlifeinsurance.atlassian.net/secure/BrowseProjects.jspa");
		driver.findElement(By.xpath("//a[@id='profileGlobalItem']")).click();
		driver.findElement(By.id("username")).sendKeys("kamal.lathwal@maxlifeinsurance.com");
		Thread.sleep(4000);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("kamal1990$$");
		Thread.sleep(3000);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("createGlobalItem")).click();
		Thread.sleep(7000);
		String hndl = driver.getWindowHandle();
		driver.switchTo().window(hndl);
		driver.findElement(By.xpath("(//span[@class='icon aui-ss-icon noloading drop-menu'])[1]"));
		
		
	}

}
