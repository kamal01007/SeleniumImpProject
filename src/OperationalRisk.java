import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperationalRisk {

	static
	{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--diable-notification");
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait waitObject = new WebDriverWait(driver, 30);
		driver.get("https://klmax0387:max@1234@cars2.maxlifeinsurance.com/");
		Thread.sleep(4000);
		// Switching into other frame to accept duplicate Login Pop-Up
		driver.switchTo().frame("SPopUp-frame");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement duplicateAccept = driver.findElement(By.id("ContentPanel_btnContinue"));		
		waitObject.until(ExpectedConditions.elementToBeClickable(duplicateAccept));		
		duplicateAccept.click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		// Finding SR Button Web-Element
		WebElement srButton = driver.findElement(By.xpath("//a[@class='SR']"));
		waitObject.until(ExpectedConditions.elementToBeClickable(srButton));
		srButton.click();		
		Thread.sleep(5000);
		//Finding Web-Element for clicking on CR Button
		WebElement crButton = driver.findElement(By.xpath("//li[@data-original-title='Change']"));
		waitObject.until(ExpectedConditions.elementToBeClickable(crButton));
		crButton.click();
		Thread.sleep(3000);
		WebElement newCRButton = driver.findElement(By.id("CM_CR_NEW"));
		waitObject.until(ExpectedConditions.elementToBeClickable(newCRButton));
		newCRButton.click();
		Thread.sleep(5000);                              
		// Selecting App NEO - Support -L2 as owner workGroup
		WebElement workGroup = driver.findElement(By.id("BodyContentPlaceHolder_ddlOwner_Workgroup_Id"));
		
		//waitObject.until(ExpectedConditions.elementToBeSelected(workGroup));
		Select selectOwnerWorkGroup = new Select(workGroup);
		selectOwnerWorkGroup.selectByValue("160");
		Thread.sleep(5000);
		
		
		// Selecting operational risk
		WebElement operationalRisk = driver.findElement(By.id("BodyContentPlaceHolder_btnOpRiskAssessmentUpdate"));
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.elementToBeClickable(operationalRisk));
		operationalRisk.click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("rbt1_9_28")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt1_10_30")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_11_31")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt1_24_76")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt1_25_78")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_26_79")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("BodyContentPlaceHolder_btnOpRiskAnswers")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("BodyContentPlaceHolder_btnBRiskAssessmentUpdate")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_12_35")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_13_40")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("BodyContentPlaceHolder_btnBRiskAnswers")).click();
	    Thread.sleep(2000);

	    
	    
	    
		
		
	}
	
}
