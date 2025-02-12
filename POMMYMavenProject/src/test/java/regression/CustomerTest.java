package regression;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.Login;
import page.Menu;
import Utility.ForDataProvider;
public class CustomerTest {
	
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
	
	
	@Test(dataProvider ="getData")
	public void ClickCustomer(String Name, String address,String number1,String number2,String expected,String Xpathactual) {
	
		Menu m=new Menu(driver);
		m.ClickAddCustomer();
		AddCustomerPage AC= new AddCustomerPage(driver);
		AC.Set_Fullname(Name);
		AC.Set_Address(address);
		AC.set_Contact1(number1);
		AC.Set_Contact2(number2);
		AC.Click_add();
		//String expected="Dashboard";
		String actual="";
		try {
			actual=driver.findElement(By.xpath(Xpathactual)).getText();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("expected="+expected);
		System.out.println("actual="+Xpathactual);
        Assert.assertEquals(actual, expected,"This test is failed");
		
	}
	
	
	 @DataProvider
	    public Object[][] getData() {
	        try {
	            return ForDataProvider.getMyData("Data/CustomerData.xlsx", "CustomerData");
	        } catch (IOException e) {
	            e.printStackTrace();
	            return new Object[][] {}; // Return empty data in case of an error
	        }
	    }
}

