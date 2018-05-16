package Test;

import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;
import Generics.ExcelLibrary;

public class ActitimeCreateProject extends BaseTest implements AutoConstant
{
	@Test
	public void project() throws InterruptedException
	{
		String proName= ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 3, 0);
		
		POM.ActitimeCreateProject pro=new POM.ActitimeCreateProject(driver);
		pro.createProjcet(proName);
		
	}
}
