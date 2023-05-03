package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class SalesPage  extends BaseClassAssignment  {
	
public  SalesPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}

	
	public OppurtunityPage clickKeysAll() throws InterruptedException
	{
		WebElement findElement2 = driver.findElement(By.xpath("//a[@aria-label='View All Key Deals']"));
		driver.executeScript("arguments[0].click();", findElement2);
		Thread.sleep(3000);
		return new OppurtunityPage(driver);
	}

}
