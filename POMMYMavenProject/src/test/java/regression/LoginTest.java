package regression;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Login;

public class LoginTest {
	
@Test
public void loginTest() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://stock.scriptinglogic.in/");
	
	Login login=new Login(driver);
	login.setTxtUsername("admin");
	login.setTxtPassword("admin");
	login.clicklogin();
	
}

}
