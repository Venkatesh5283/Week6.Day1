package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;

public class NewOppurtunityPage extends BaseClassAssignment {
	
public  NewOppurtunityPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	public NewOppurtunityPage enterOppName()
	{
		driver.findElement(By.xpath("(//input[@part='input'])[3]")).sendKeys("POM Automation by Venkatesh");
		return this;
	}

	public NewOppurtunityPage enterDate() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("04/05/2023");
		Thread.sleep(3000);
		return this;
	}
	
	public NewOppurtunityPage selectStage()
	{
        driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		return this;
	}
	
	public VerifyOppurtunityPage clickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		return new VerifyOppurtunityPage(driver);
	}
}
