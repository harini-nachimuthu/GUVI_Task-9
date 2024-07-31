package Ques_3;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver web1=null;
		try {
			//launching firefox browser
			web1=new ChromeDriver();
			//with implicitylywait giving some time to for webdriver to wait before providing exception(no suchelement)
			web1.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			//navigate to wikipedia
			web1.navigate().to("https://www.wikipedia.org/");
			//maximize the window
			web1.manage().window().maximize();
			//search the element "SEARCH" using By class
			WebElement findsearch=web1.findElement(By.id("searchInput"));
			findsearch.sendKeys("Artificial Intelligence",Keys.ENTER);
			//search element "HISTORY" using By class xpath
			WebElement historysearch=web1.findElement(By.xpath("//span[normalize-space()=\"History\"]"));
			historysearch.click();
			//Thread command used to pause the thread execution for given time (1s=1000 ms)
			Thread.sleep(6000);
			//get title name using get
			String currenttitle=web1.getTitle();
			System.out.println(currenttitle);
			//take screeshot of current page using takescreenshot interface
			File file1=((TakesScreenshot)web1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("C:\\Users\\harin\\eclipse-workspace\\Task-9_selenium\\Task-9_Screenshot\\Ques_3.png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//close the current window
			web1.close();
		}
	}

}
