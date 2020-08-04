package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void openapplications()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com/");
	}
	@AfterMethod
	public void closeapplications() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}

}
