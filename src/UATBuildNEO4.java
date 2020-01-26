//import java.util.concurrent.TimeUnit;

//import javax.crypto.ExemptionMechanismException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UATBuildNEO4 {
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
		Thread.sleep(8000);
		
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
	    
	    // Selecting input in Business Risk
	    
	    driver.findElement(By.id("BodyContentPlaceHolder_btnBRiskAssessmentUpdate")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_12_35")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("rbt0_13_40")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("BodyContentPlaceHolder_btnBRiskAnswers")).click();
	    Thread.sleep(2000);
	    
	 // Providing input in Priority
	 		WebElement priority = driver.findElement(By.id("BodyContentPlaceHolder_ddlPriority_Id"));
	 		Select selectPriority = new Select(priority);
	 		selectPriority.selectByValue("3");
	 		Thread.sleep(2000);
	 		// Providing input in Urgency 
	 		WebElement urgency = driver.findElement(By.id("BodyContentPlaceHolder_ddlImpact_Id"));
	 		Select selectUrgency = new Select(urgency);
	 		selectUrgency.selectByValue("3");
	 		Thread.sleep(3000);
	 		// Providing input in Impact
	 		WebElement impact = driver.findElement(By.id("BodyContentPlaceHolder_lstCriticality"));
	 		Select selectImpact = new Select(impact);
	 		selectImpact.selectByValue("3");
	 		Thread.sleep(3000);
	 		// Providing input in risk
	 		WebElement risk = driver.findElement(By.id("BodyContentPlaceHolder_ddlRisk_Id"));
	 		Select selectRisk = new Select(risk);
	 		selectRisk.selectByValue("3");
	 		Thread.sleep(8000);
	 		
	 		//Selecting Assigned WorkGroup as DCO Application MiddleWare
			WebElement assignedWorkGroup = driver.findElement(By.id("BodyContentPlaceHolder_ddlAssigned_Workgroup_Id"));
			Select selectAssignedWorkGroup = new Select(assignedWorkGroup);
			selectAssignedWorkGroup.selectByValue("336");
			Thread.sleep(3000);
			
			// Selecting Env as Testing Environment
			
		      WebElement testingEnvironment = driver.findElement(By.id("BodyContentPlaceHolder_ddlCategory"));
				
				//waitObject.until(ExpectedConditions.elementToBeSelected(workGroup));
				Select selecttestingEnvironment = new Select(testingEnvironment);
				selecttestingEnvironment.selectByValue("5");
				Thread.sleep(2000);
				
				// Entering input in Description 
				WebElement description = driver.findElement(By.id("BodyContentPlaceHolder_txtDescription"));
				description.sendKeys("Build promotion for NEO4 over UAT env");
				Thread.sleep(3000);
				
				// Entering input in information Text Area
				WebElement information = driver.findElement(By.id("BodyContentPlaceHolder_txtInformation"));
				information.sendKeys("Please follow below mentioned instructions");
				Thread.sleep(3000);
						
				
				// Entering input for Project Name
				WebElement projectName = driver.findElement(By.id("txt_20"));
				projectName.sendKeys("NEO");
				Thread.sleep(3000);
				
				// Selecting Environment Name as UAT
				WebElement environmentName = driver.findElement(By.id("cddl_60"));
				Select selectEnvironmentName = new Select(environmentName);
				selectEnvironmentName.selectByValue("93");
				Thread.sleep(3000);
				// Selecting Promotion Type
				WebElement promotionType = driver.findElement(By.id("cddl_23"));
				Select selectPromotionType = new Select(promotionType);
				selectPromotionType.selectByValue("4");
				Thread.sleep(3000);
				// Selecting Promotion on Control-M as NO
				WebElement promotionOnControlM = driver.findElement(By.id("cddl_61"));
				Select selectPromotionOnControlM = new Select(promotionOnControlM);
				selectPromotionOnControlM.selectByValue("85");
				Thread.sleep(3000);
				// Selecting input in Testing Completion as YES
				WebElement testingCompletion = driver.findElement(By.id("cddl_68"));
				Select selectTestingCompletion = new Select(testingCompletion);
				selectTestingCompletion.selectByValue("95");
				Thread.sleep(3000);
				// Providing input in Testing Status Remarks
				WebElement testingStatusRemarks = driver.findElement(By.id("txt_69"));
				testingStatusRemarks.sendKeys("Same is verified over Lower Environment");
				Thread.sleep(3000);
				
				
				// Entering input in Promotion instructions
				WebElement promotionInstruction = driver.findElement(By.id("txt_54"));
				promotionInstruction.sendKeys("Hi Team ---> Please deploy the latest build from SVN repos for Chassis, Acquisition & Fulfilment on UAT env for NEO 4");
				Thread.sleep(3000);
				
				// Entering input in trigger for change
				
				driver.findElement(By.id("BodyContentPlaceHolder_txtTriggerForChange")).sendKeys("To increase customer coverage in order to increase business revenue");
				Thread.sleep(5000);
				
				
		
		// Uploading ZIP file Starts here
		
		driver.findElement(By.id("file_56")).sendKeys("D:\\NEO4 Build Activity\\UAT Build Promotion.msg");
		
		
		// Uploading ZIP File Ends Here	
		
		// Moving to RISK page	
		
		
		
		driver.findElement(By.id("TRISK")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("BodyContentPlaceHolder_txtRisk_Of_Change_Failure")).sendKeys("Will roll back in case of failure");
		Thread.sleep(2000);
		driver.findElement(By.id("BodyContentPlaceHolder_txtBack_Out_Plan")).sendKeys("Will roll back in case of failure");
		Thread.sleep(2000);
		driver.findElement(By.id("BodyContentPlaceHolder_txtImpactOfNotImplementingChange")).sendKeys("Our goal is to increase customer coverage as well as business revenue, If not implemented then achievable goal will get impacted");
		Thread.sleep(3000);
		WebElement backoutPlanTested = driver.findElement(By.id("ddlBoutPlanTested"));
		Select selectbackoutPlanTested = new Select(backoutPlanTested);
		selectbackoutPlanTested.selectByValue("1");
		Thread.sleep(7000);
		
		/*driver.findElement(By.id("TREL")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[.='Link']")).click();
		Thread.sleep(3000);
		// Switching into another frame for selection of CR
		driver.switchTo().frame("SPopUp-frame");
		Thread.sleep(2000);
		// Selecting CR to Link
		WebElement changeRequest = driver.findElement(By.id("ContentPanel_ddlModule"));
		Select selectChangeRequest = new Select(changeRequest);
		selectChangeRequest.selectByValue("CM");
		Thread.sleep(2000);
		// Entering CR no for searching
		driver.findElement(By.id("ContentPanel_txtFrom_Change_No")).sendKeys("23411");
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPanel_ibtnSearchCh")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ContentPanel_gvAvailableRecords_chkSelect_Row_WOPopup_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPanel_imgSaveRelations")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		// Finally submitting CR
*/		
	}

}
