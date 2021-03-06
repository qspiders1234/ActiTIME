package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateCustomer 
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement taskLInk;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLInk;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomerLink;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerName;
	
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement createNewButton;
	
	
	public ActitimeCreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCustomerMethod(String cusName) throws InterruptedException
	{
		taskLInk.click();
		Thread.sleep(3000);
		addNewLInk.click();
		Thread.sleep(3000);
		newCustomerLink.click();
		Thread.sleep(3000);
		customerName.sendKeys(cusName);
		Thread.sleep(3000);
		createNewButton.click();
		
	}
}
