package testBaseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	public void intialize(String browser, String URL) {
		
		launchBrowser(browser);
		getURL(URL);		
	}
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver1.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void getURL(String URL) {
			driver.get(URL);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}