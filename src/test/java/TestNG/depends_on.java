package TestNG;

import org.testng.annotations.Test;

public class depends_on 
{
	@Test
	public void start_car()
	{
		System.out.println("car started");
	}
	
	@Test(dependsOnMethods = "start_car")
	public void drive_car()
	{
		System.out.println("driving started");
	}
	
	@Test(dependsOnMethods = "drive_car")
	public void park_car()
	{
		System.out.println("car parked");
	}
	
	@Test(dependsOnMethods = "park_car")
	public void stop_car()
	{
		System.out.println("car stopped");
	}
}
