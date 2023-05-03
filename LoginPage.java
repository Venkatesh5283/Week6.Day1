package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public LoginPage enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Method 1 using this keyword
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Method 2  Using Constructor
//		LoginPage lp=new LoginPage();
//		return lp;
		return this;
	}
	
	public HomePage clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
		
	}
}
