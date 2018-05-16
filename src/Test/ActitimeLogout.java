package Test;

import org.testng.annotations.Test;

import Generics.AutoConstant;
import Generics.BaseTest;

public class ActitimeLogout extends BaseTest implements AutoConstant
{
	@Test
	public void logout()
	{
		POM.ActitimeLogout log=new POM.ActitimeLogout(driver);
		log.logout();
	}
}
