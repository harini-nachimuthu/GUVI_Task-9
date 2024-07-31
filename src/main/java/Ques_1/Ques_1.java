package Ques_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ques_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver web1 = null;
		try {
			//launching firefox browser
			web1 = new FirefoxDriver();
			//with implicitylywait giving some time to for webdriver to wait before providing exception(no suchelement)
			web1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//maximize the window
			web1.manage().window().maximize();
			//navigating to google.com
			web1.navigate().to("http://google.com");
			//Thread command used to pause the thread execution for given time (1s=1000 ms)
			Thread.sleep(3000);
			//this command used to get currenturl of the webpage
			String currenturl=web1.getCurrentUrl();
			System.out.print("Current URL : "+currenturl);
			//regresh the page
			web1.navigate().refresh();
			//take screeshot of current page using takescreenshot interface
			File file1=((TakesScreenshot) web1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("C:\\Users\\harin\\eclipse-workspace\\Task-9_selenium\\Task-9_Screenshot\\Ques_1.png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//close all window end webdriver session
			web1.quit();
		}
		
		
		

	}

}
