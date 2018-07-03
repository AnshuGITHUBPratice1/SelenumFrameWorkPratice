package genericActionsLibrary;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver, String screenshotName)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File fs = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fs, new File("./Screenshots/"+screenshotName+".jpg"));			
		}
		catch(Exception e)
		{
			System.out.println("Ooops...! Got exception while taking screenshot. "+e.getMessage());
		}
	}
}
