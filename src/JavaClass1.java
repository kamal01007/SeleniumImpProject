import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaClass1 {
	static{
		System.setProperty("webdriver.chrome.driver", "D:/for eclipse/chromedriver_win32/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		System.out.println("Main method starts ");
		driver.get("https://selenium.dev/");
		WebElement dowload = driver.findElement(By.linkText("Downloads"));
		dowload.click();

		List<WebElement> supportedLanguage = driver.findElements(By.xpath("//td[@data-label='Language']"));	    
//		ArrayList<String> langArrayList = new ArrayList<String>();
//		for(WebElement ele : supportedLanguage)
//		{
//			langArrayList.add(ele.getText());   	    	
//		}
//		int langSize = langArrayList.size();	  
////		String[] selLang = new String[langSize];
////		selLang = (String[]) langArrayList.toArray();
//		
//		String[] LanList = (String[])langArrayList.toArray();

		List<WebElement> supportedVersion = driver.findElements(By.xpath("//td[@data-label='Version']"));
//		ArrayList<String> versionList = new ArrayList<String>();
//		for(WebElement ele1 : supportedVersion)
//		{
//			versionList.add(ele1.getText());   	    	
//		}
//		int langSize1 = versionList.size();	  
//		String[] suppVersion = new String[langSize1];
//		suppVersion = (String[]) versionList.toArray();   

		List<WebElement> releaseDate = driver.findElements(By.xpath("//td[@data-label='Release Date']"));
//		ArrayList<String> releaseList = new ArrayList<String>();
//		for(WebElement ele1 : releaseDate)
//		{
//			releaseList.add(ele1.getText());   	    	
//		}
//		int langSize2 = releaseList.size();	  
//		String[] releaseDateList = new String[langSize2];
//		releaseDateList = (String[]) releaseList.toArray();
//		
//		for( int i= 0 ; i< langSize2 ; i++ )
//		{
////			System.out.println(selLang[i]);
//			System.out.println(suppVersion[i]);
//			System.out.println(releaseDateList[i]);
//			System.out.println("****************************");
//		}
		for(int i =0;i<releaseDate.size();i++)
		{
			System.out.println(supportedLanguage.get(i).getText());
			System.out.println(releaseDate.get(i).getText());
			System.out.println(supportedVersion.get(i).getText());
			System.out.println("*******************************");
		}

	}
}
