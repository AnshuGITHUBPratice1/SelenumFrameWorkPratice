package pageObjectsLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBRegistrationObjects {
	
	@FindBy(xpath="//input[@id='u_0_j']")
	public WebElement firstName;
	
	@FindBy(id="u_0_l")
	public WebElement lastName;

	@FindBy(id="u_0_o")
	public WebElement emailId;
	
	@FindBy(id="u_0_r")
	public WebElement confrmEmailID;
	
	
	@FindBy(id="u_0_v")
	public WebElement password;
	
	@FindBy(id="u_0_9")
	public WebElement female;
	
	@FindBy(id="u_0_a")
	public WebElement male;
	
	@FindBy(id="day")
	public WebElement day;
	
	@FindBy(id="month")
	public WebElement mnth;
	
	@FindBy(id="year")
	public WebElement yar;
	
	@FindBy(id="u_0_11")
	public WebElement btn;
	
	public FBRegistrationObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
