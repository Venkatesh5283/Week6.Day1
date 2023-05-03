package baseclass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public  RemoteWebDriver driver;
	

@Parameters({"browser","url"})
	@BeforeMethod
	public void preCondtions(String browser1, String url1)
	{
		if(browser1.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browser1.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url1);
	}
	
	
	@AfterMethod
	public void postConditons()
	{
		driver.close();
	}

}
