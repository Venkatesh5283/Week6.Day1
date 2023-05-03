package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class HomePageAssignment extends BaseClassAssignment  {
	
public  HomePageAssignment(RemoteWebDriver driver) {
		
		this.driver=driver;
	}

	public HomePageAssignment clickToggleButton()
	{
		driver.findElement(By.className("slds-icon-waffle")).click();
		return this;
	}
	
	public AppLauncherPage clickViewAll()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPage(driver);
	}
	
	
}
