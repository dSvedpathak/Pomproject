package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard{
	public WebDriver driver;

//	@FindBy(xpath="//a[@class='round button dark menu-logoff image-left']")
	WebElement logoutbtton;
	
	@FindBy(xpath="//a[@class=' customers-tab']")
	WebElement customer;
	
	@FindBy(xpath="//tr[td[text()='Anamika']]//a[@class='table-actions-button ic-table-edit']")
	WebElement edit;
	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void customerclick() {
		// TODO Auto-generated method stub
		customer.click();
	}
	public void editclick() {
		edit.click();
	}
}
