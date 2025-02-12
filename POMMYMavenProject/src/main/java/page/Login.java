package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="login-username")
	 WebElement txtUsername;
	
	@FindBy(id="login-password")
	 WebElement txtpassword;

	@FindBy(xpath= "//input[@name='submit']")
	 WebElement btton;
	

	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	public void setTxtUsername(String username) {
		txtUsername.sendKeys(username);
		
	}
	public void setTxtPassword(String password) {
		txtpassword.sendKeys(password);
		
	}
	public void clicklogin() {
		btton.click();;
		
	}

}
