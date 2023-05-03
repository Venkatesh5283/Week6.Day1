package runnerAssignment;

import org.testng.annotations.Test;

import baseclassAssignment.BaseClassAssignment;
import pagesAssignment.SalesforceLoginPageAssignment;

public class SalesforceAssignmentTC_002 extends BaseClassAssignment {
	
	@Test
	public void runSalesforce() throws InterruptedException
	{
	
	SalesforceLoginPageAssignment sf=new SalesforceLoginPageAssignment(driver);
	sf.salesforceUsername("venky@testleaf.sandbox").salesforcePassword("Mine@1234").clicksalesforceLogin().clickToggleButton().clickViewAll()
	.clickSales().clickKeysAll().clickNew().enterOppName().enterDate().selectStage().clickSave().verifyOpp();
	
	
	}

}
