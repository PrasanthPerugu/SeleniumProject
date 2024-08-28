package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement button_Login;
	
	
	// Action Methods
	
	public void SetUsernameDetails(String username) {
		txt_userName.sendKeys(username);
		
	}
	
	public void SetpasswordDetails(String password) {
		txt_password.sendKeys(password);
		
	}
	
	public void clickLoginbutton() {
		button_Login.click();
		
	}
}
