package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class ViewLead extends BaseClass{
	
	public ViewLead(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyCreatedLead()
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("HP")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
