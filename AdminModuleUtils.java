package orangehrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminModuleUtils extends AppUtils
{

	String adminuid = "Admin";
	String adminpwd = "Qedge123!@#";
	
	LoginPage lp = new LoginPage();
	
	@BeforeTest
	public void adminLogin()
	{
		
		lp.login(adminuid, adminpwd);		
	}
		
	@AfterTest
	public void adminLogout()
	{
		lp.logout();
	}
}
