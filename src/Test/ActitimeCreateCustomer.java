package Test;

import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;
import Generics.ExcelLibrary;

public class ActitimeCreateCustomer extends BaseTest implements AutoConstant
{
	@Test
	public void createCus() throws InterruptedException
	{
		String cusName=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 2, 0);
		
		POM.ActitimeCreateCustomer act=new POM.ActitimeCreateCustomer(driver);
		act.createCustomerMethod(cusName);
		
	}
	
}
