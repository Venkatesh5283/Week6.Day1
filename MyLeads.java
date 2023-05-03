package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class MyLeads extends BaseClass {
	
	public MyLeads(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLead clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);
	}

}
