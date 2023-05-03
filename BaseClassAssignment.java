package baseclassAssignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassAssignment {
	
	public RemoteWebDriver driver;
	//public String filename;
	
	@Parameters({"browser", "url"})
	
	

	
	@BeforeMethod
	public void preCondition(String browser1, String url1) throws InterruptedException
	{
		if(browser1.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions copt = new ChromeOptions();
			copt.addArguments("--disable-Notifications");
			driver = new ChromeDriver(copt);
		}
		else if(browser1.equalsIgnoreCase("Edge"))
		{
			EdgeOptions eopt=new EdgeOptions();
			eopt.addArguments("--diable-Notifications");
			driver=new EdgeDriver(eopt);
		}
//		ChromeOptions copt = new ChromeOptions();
//		copt.addArguments("--disable-Notifications");
//	driver = new ChromeDriver(copt);
		
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url1);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
		
	}

}
