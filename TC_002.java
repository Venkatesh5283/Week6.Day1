package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass {
	
	@Test
	public void runCreateLead()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLoginButton().clickCRMSFA().clickLead().clickCreateLead().enterCName().enterFName().enterLName().clickCreateLead().verifyCreatedLead();
				
			
				
	}

}
