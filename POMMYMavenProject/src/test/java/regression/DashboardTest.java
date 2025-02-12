package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Dashboard;
import page.Login;

public class DashboardTest {
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
	
	public void customerclick() {
		Dashboard d =new Dashboard(driver);
		d.customerclick();
		d.editclick();
	}
	
}
