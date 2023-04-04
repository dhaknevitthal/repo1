package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser1 
{
	WebDriver driver;
	@BeforeSuite
	@Parameters({"bname"})
	public void open_browser(String bname)
	{
		
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitth\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("open "+bname+" browser");
		}
		
		else if(bname.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vitth\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("open "+bname+" browser");
		}
		
	}
	
	@BeforeTest
	public void open_url()
	{
		driver.get("https://www.flipkart.com/");
	}
	
//	@BeforeClass
//	public void max()
//	{
//		driver.manage().window().maximize();
//		//System.out.println("gt cookies");
//	}
//	
//	@BeforeMethod
//	public void gt_cookies()
//	{
//		System.out.println("gt_cookies");
//	}
//	@Test
//	public void test1()
//	{
//		System.out.println("url opened in ");
//	}
}
