package runnerAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclassAssignment.BaseClassAssignment;
import pagesAssignment.SalesforceLoginPageAssignment;


public class SaleforceAssignmentTC_001 extends BaseClassAssignment {
	
	@Test
	public void runSalesforce() throws InterruptedException
	{
	
	SalesforceLoginPageAssignment sf=new SalesforceLoginPageAssignment(driver);
	sf.salesforceUsername("venky@testleaf.sandbox").salesforcePassword("Mine@1234").clicksalesforceLogin().clickToggleButton().clickViewAll()
	.clickSales().clickKeysAll().clickNew().enterOppName().enterDate().selectStage().clickSave().verifyOpp();
	
	
	}

}
