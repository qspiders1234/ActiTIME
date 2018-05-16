package Test;

import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;
import Generics.ExcelLibrary;

public class ActitimeLogin extends BaseTest implements AutoConstant
{
	@Test
	public void loginin() throws InterruptedException
	{
	String un=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 0, 0);
	String pass=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 1, 0);
	
	POM.ActitimeLogin log=new POM.ActitimeLogin(driver);
	log.login(un, pass);
	
	}
	
}
