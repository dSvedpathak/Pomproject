package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	@FindBy(xpath ="//input[@id='name']") WebElement FULLNAME;
	@FindBy(xpath ="//textarea[@placeholder='ENTER YOUR ADDRESS']") WebElement ADDRESS;
	@FindBy(xpath ="//input[@id='buyingrate']") WebElement Contact1;
	@FindBy(xpath ="//input[@id='sellingrate']") WebElement Contact2;
	@FindBy(xpath="//input[@name='Submit']") WebElement addbutton;
	
	public AddCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	public void Set_Fullname(String name) {
	    FULLNAME.sendKeys(name);
	}
	public void Set_Address(String address) {
	    ADDRESS.sendKeys(address);
	}

	public void set_Contact1(String number1) {
	    Contact1.sendKeys(number1);
	}
	public void Set_Contact2(String number2) {
	    Contact2.sendKeys(number2);
	}
	public void Click_add() {
		addbutton.click();
	}
	

	}
