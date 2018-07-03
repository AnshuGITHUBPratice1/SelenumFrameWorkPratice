package pageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericActionsLibrary.ExcelFile;

import pageActionsLibrary.LoginPageActions;
import testBaseLibrary.TestBase;


public class LoginPageTests extends TestBase {

	LoginPageActions loginPageActions;
	
	@BeforeMethod
	public void intializeTest()
	{
		intialize("chrome","https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	@Test
	public void loginWithValidCredentials() {
		
		try
		{
			loginPageActions = new LoginPageActions(driver);
			String username = ExcelFile.readExcel(0,1,0);
			String password = ExcelFile.readExcel(0,1,1);
			loginPageActions.enterUsername(username);
			loginPageActions.clickNextBtn();
			loginPageActions.enterPassword(password);
			
			}
		catch(Exception e)
		{
			System.out.println("Exception Occured in Test1: "+e.getMessage());
		}
	}
	
	@AfterMethod
	public void closeTest()
	{
		closeBrowser();
	}
}
