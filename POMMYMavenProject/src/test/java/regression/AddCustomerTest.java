package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Customer;
import page.Login;
import page.Menu;

public class AddCustomerTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stock.scriptinglogic.in/");
		Login login=new Login(driver);
		login.setTxtUsername("admin");
		login.setTxtPassword("admin");
		login.clicklogin();
	}
@Test
public void AddCustomer() {
	Menu m=new Menu(driver);
	m.ClickAddCustomer();
	
}
}
