package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups 
{
	WebDriver driver;
	@BeforeSuite 
	public void open_browser()
	{
		System.out.println("open Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void open_url()
	{
		System.out.println("Launch Application");
		driver.get("https://www.mercurytravels.co.in/");
	}
	
	@BeforeClass
	public void Maximize()
	{
		System.out.println("Max browser");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void get_cookies()
	{
		System.out.println("get cookies");
	}
	
	@Test(groups = {"group1"})
	public void Business_logic_one() throws InterruptedException
	{
		System.out.println("Test One Completed");
		Actions action = new Actions(driver);
		
		WebElement customer_login = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		action.click(customer_login).perform();
		
		Thread.sleep(2000);
		
		WebElement user_login = driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]"));
		
		user_login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil645@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_password")).sendKeys("sushil@12");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		
		WebElement x = driver.findElement(By.xpath("(//button[contains(text(),'�')])[2]"));
		
		Thread.sleep(2000);
		
		if(x.isDisplayed())
		{
			x.click();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
			Thread.sleep(2000);
			
		}
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' Log Out')])[2]")).click();
		
		Thread.sleep(2000);
		
	}
	@Test(groups = {"group2"})
	public void Business_logic_two() throws InterruptedException
	{
		System.out.println("test two completed");
		
		
		Actions action = new Actions(driver);
		
		WebElement customer_login = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		action.click(customer_login).perform();
		
		Thread.sleep(2000);
		
		WebElement user_login = driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]"));
		
		user_login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil645@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_password")).sendKeys("sushil@12");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		
		WebElement x = driver.findElement(By.xpath("(//button[contains(text(),'�')])[2]"));
		
		Thread.sleep(2000);
		
		if(x.isDisplayed())
		{
			x.click();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
			Thread.sleep(2000);
			
		}
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' Log Out')])[2]")).click();
		
		Thread.sleep(2000);
		
		
	}
	@Test(groups = {"group3"})
	public void Business_logic_Three() throws InterruptedException
	{
		System.out.println("test three completed");
		
		System.out.println("Test One Completed");
		Actions action = new Actions(driver);
		
		WebElement customer_login = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		action.click(customer_login).perform();
		
		Thread.sleep(2000);
		
		WebElement user_login = driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]"));
		
		user_login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_email")).sendKeys("vitthaldhakne777@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_password")).sendKeys("Vitt@2424");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' Log Out')])[2]")).click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	@Test(groups = {"group4"})
	public void Business_logic_four() throws InterruptedException
	{
        System.out.println("test four completed");
	
		Actions action = new Actions(driver);
		
		WebElement customer_login = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		action.click(customer_login).perform();
		
		Thread.sleep(2000);
		
		WebElement user_login = driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]"));
		
		user_login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_email")).sendKeys("vitthaldhakne777@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_password")).sendKeys("Vitt@2424");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' Log Out')])[2]")).click();
		
		Thread.sleep(2000);
	}
}

