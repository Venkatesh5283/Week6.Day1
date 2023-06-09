package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
