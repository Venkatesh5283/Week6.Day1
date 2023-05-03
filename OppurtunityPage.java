package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class OppurtunityPage extends BaseClassAssignment {
	
public  OppurtunityPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}

	public NewOppurtunityPage clickNew() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(3000);
		return new NewOppurtunityPage(driver);
	}
}
