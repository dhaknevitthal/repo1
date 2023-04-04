package TestNG;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.Test;

public class enable_disable 
{
	 @Test(enabled = false)
	 public void test1()
	 {
		 System.out.println("Test 1 completed");
	 }
	 
	 @Test
	 public void test2()
	 {
		 System.out.println("test 2 completed");
	 }
	 
	 @Test(enabled = false)
	 public void test3()
	 {
		 System.out.println("test 3 completed");
	 }
	 
	 @Test
	 public void test4()
	 {
		 System.out.println("test 4 completed");
	 }
}
