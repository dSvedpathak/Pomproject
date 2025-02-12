package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
WebDriver driver;

@FindBy(xpath ="//a[normalize-space()='Sales']") WebElement sales;
@FindBy(xpath ="//a[normalize-space()='Customers']") WebElement customers;
@FindBy(xpath ="//a[normalize-space()='Add Customer']") WebElement addCustomer;
@FindBy(xpath ="//a[normalize-space()='View Customers']") WebElement viewCustomers;
@FindBy(xpath ="//a[normalize-space()='Purchase']") WebElement purchase;
@FindBy(xpath ="//a[normalize-space()='Supplier']") WebElement supplier;
@FindBy(xpath ="//a[normalize-space()='Stocks / Products']") WebElement stocks_Products;
@FindBy(xpath ="//a[normalize-space()='Payments / Outstandings']") WebElement payments_Outstandings;
@FindBy(xpath ="//a[normalize-space()='Reports']") WebElement reports;

public Menu(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void Clicksales() {
	sales.click();
}
public void ClickAddCustomer() {
    customers.click();
    addCustomer.click();
}

public void ClickViewCustomers() {
    customers.click();
    viewCustomers.click();
}

public void ClickPurchase() {
    purchase.click();
}

public void ClickSupplier() {
    supplier.click();
}

public void ClickStocksProducts() {
    stocks_Products.click();
}

public void ClickPaymentsOutstandings() {
    payments_Outstandings.click();
}

public void ClickReports() {
    reports.click();
}


}