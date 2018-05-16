package Test;

import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;
import Generics.ExcelLibrary;

public class ActitimeCreateTask extends BaseTest implements AutoConstant
{
	@Test
	public void task() throws InterruptedException
	{
		String taskName=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2",4,0);
		
		POM.ActitimeCreateTask task=new POM.ActitimeCreateTask(driver);
		task.createTask(taskName);
		
	}
}
