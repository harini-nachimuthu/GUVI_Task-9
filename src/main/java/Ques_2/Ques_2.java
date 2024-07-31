package Ques_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver web1 = null;
		try {
			//launching firefox browser
			web1 = new ChromeDriver();
			//with implicitylywait giving some time to for webdriver to wait before providing exception(no suchelement)
			web1.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			//navigate to demoblaze
			web1.navigate().to("https://www.demoblaze.com/");
			//maximize the window
			web1.manage().window().maximize();
			//get the title name in string and compare it
			String titlename=web1.getTitle();
			//Thread command used to pause the thread execution for given time (1s=1000 ms)
			Thread.sleep(6000);
			if(titlename.equals("STORE")) {
				System.out.println("Page landed on current website");
			}else {
				System.out.println("Page not landed on current website");
			}
			//take screeshot of current page using takescreenshot interface
			File file1=((TakesScreenshot)web1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("C:\\Users\\harin\\eclipse-workspace\\Task-9_selenium\\Task-9_Screenshot\\Ques_2.png"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//close the current window
			web1.close();
		}
		

	}

}
