package pageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericActionsLibrary.ExcelFile;
import pageActionsLibrary.FBRegistrationActions;
import testBaseLibrary.TestBase;

public class FBRegTest extends TestBase {
	
	FBRegistrationActions fbr;
	
	@BeforeMethod
	public void intializeTest()
	{
	intialize("chrome","https://www.facebook.com/");
	}
	
	@Test
	public void FBRegstTest() {
		
		try {
			fbr = new FBRegistrationActions(driver);
			
			String fn = ExcelFile.readExcel(1,1,0);
			String ln = ExcelFile.readExcel(1,1,1);
			String email = ExcelFile.readExcel(1,1,2);
			String pass = ExcelFile.readExcel(1,1,3);
			String dd = ExcelFile.readExcel(1,1,4);
			String mm = ExcelFile.readExcel(1,1,5);
			String yr = ExcelFile.readExcel(1,1,6);
			String ge = ExcelFile.readExcel(1,1,7);
			
			fbr.enterFirstName(fn);
			fbr.enterLastName(ln);
			fbr.enterEmailId(email);
			fbr.enterConfrmEmailId(email);	
			fbr.enterPassword(pass);
			fbr.selectGender(ge);
			fbr.selectDOB(dd, mm, yr);
			fbr.signUp();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured in Test1: "+e.getMessage());
		}
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
