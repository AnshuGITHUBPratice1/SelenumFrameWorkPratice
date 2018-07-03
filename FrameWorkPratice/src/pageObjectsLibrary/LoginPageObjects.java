package pageObjectsLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	@FindBy(xpath="//input[@id='identifierId']")
	public WebElement userName;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement next;
	
	@FindBy(id="password")
	public WebElement password;
	
	public LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
