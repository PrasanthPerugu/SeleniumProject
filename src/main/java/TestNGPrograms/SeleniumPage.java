package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	WebDriver driver;
	
	public SeleniumPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//input[@id='my-text-id']")
	WebElement txt_input;
	
	@FindBy(xpath = "//input[@name='my-password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//textarea[@name='my-textarea']")
	WebElement txt_area;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit_Button;
	
	
	public void SetInput(String input) {
		txt_input.sendKeys(input);
		
	}
	
	public void SetPass(String password) {
		txt_password.sendKeys(password);
	}
	
	public void SetArea(String AreaData) {
		txt_area.sendKeys(AreaData);
	}
	
	public void button() {
		submit_Button.click();
	}

}
