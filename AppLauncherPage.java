package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class AppLauncherPage extends BaseClassAssignment{
	
public  AppLauncherPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	public SalesPage clickSales() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		
		return new SalesPage(driver);
	}

}
