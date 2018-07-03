package pageActionsLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectsLibrary.FBRegistrationObjects;

public class FBRegistrationActions extends FBRegistrationObjects{

	public FBRegistrationActions(WebDriver driver) {
		super(driver);
	}
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterConfrmEmailId(String email) {
		confrmEmailID.sendKeys(email);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			male.click();
		}
		else
		{
			female.click();
		}
	}
	
	public void selectDOB(String dd, String mmm, String year) {
		Select dt=new Select(day);
		dt.selectByValue(dd);
		
		Select mmon = new Select(mnth);
		mmon.selectByVisibleText(mmm);
		
		Select yr =new Select(yar);
		yr.selectByValue(year);
	}
	
	public void signUp() {
		btn.click();;
	}
}
