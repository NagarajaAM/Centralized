package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 2)
	public void test1()
	{
		Reporter.log("TC IS PASS__1",true);	
	}
	@Test(priority = 4)
	public void test2()
	{
		Reporter.log("TC IS FAIL__2",true);	
	}
	@Test(priority = 1)
	public void test3()
	{
		Reporter.log("TC IS FAIL__3",true);	
	}
}
