package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class SalesforceLoginPageAssignment extends BaseClassAssignment {
	
	public  SalesforceLoginPageAssignment(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	public SalesforceLoginPageAssignment salesforceUsername(String user1)
	{
		driver.findElement(By.id("username")).sendKeys(user1);
		return this;
		
	}
	
	public SalesforceLoginPageAssignment salesforcePassword(String pass1)
	{
		driver.findElement(By.id("password")).sendKeys(pass1);
		return this;
	}
	
	public HomePageAssignment clicksalesforceLogin()
	{
		driver.findElement(By.id("Login")).click();
		return new HomePageAssignment(driver);
	}
	

}
