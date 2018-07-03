package pageActionsLibrary;

import org.openqa.selenium.WebDriver;

import pageObjectsLibrary.LoginPageObjects;

public class LoginPageActions extends LoginPageObjects {

	public LoginPageActions(WebDriver driver) {
		super(driver);
	}
	
	public void enterUsername(String UserName) {
		userName.sendKeys(UserName);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickNextBtn() {
		next.click();
	}

}
