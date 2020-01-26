import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/klmax0387/Desktop/assignment.html");
		WebElement text1 = driver.findElement(By.id("text1"));
		WebDriverWait wait = new 
		if(text1=="TY")
		{
			
		}

	}

}
