package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public CreateLead enterCName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HP");
		return this;
	}
	
	public CreateLead enterFName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vikesh");
		return this;
	}
	
	public CreateLead enterLName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
	}
	
	public ViewLead clickCreateLead()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
}
