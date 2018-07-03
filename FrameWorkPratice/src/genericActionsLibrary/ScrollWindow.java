package genericActionsLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollWindow {
	
	public static void windowScroll(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("Windows.scroll(1000,1000)");		
	}

}
