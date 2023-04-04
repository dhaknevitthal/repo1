package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	@BeforeSuite
	public void open_browser() 
	{
		System.out.println("Open Browser");
	}
	
	@BeforeTest
	public void open_url()
	{
		System.out.println("Oprn url");
	}
	
	@BeforeClass
	public void maximize_browser()
	{
		System.out.println("Browser Max");
	}
	@BeforeMethod
	public void get_cookies()
	{
		System.out.println("gt cookies");
	}
	
	@Test
	public void Business_logic_one()
	{
		System.out.println("Test 1 completed");
	}
	
	@Test
	public void Business_logic_two()
	{
		System.out.println("Test 2 completed");
	}
	
	@AfterMethod
	public void get_screenShots()
	{
		System.out.println("get ScrnneShots");
	}
	
	@AfterClass
	public void delete_cookies()
	{
		System.out.println("Delete cookies");
	}
	
	@AfterTest
	public void close_db_connection()
	{
		System.out.println("close db connections");
	}
	
	@AfterSuite
	public void close_browser()
	{
		System.out.println("close_browser");
	}
	
}
