package Test;


import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;
import Generics.ExcelLibrary;

public class ActitimeCreateBillingType extends BaseTest implements AutoConstant
{
	@Test
	public void bill() throws InterruptedException
	{
		String billName=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 4, 0);
		
		
		POM.ActitimeCreateBillingType billing=new POM.ActitimeCreateBillingType(driver);
		billing.bilingtask(billName);
	}
}
