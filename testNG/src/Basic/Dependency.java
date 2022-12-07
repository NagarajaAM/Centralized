package Basic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency 
{
	@Test
	public void test1()
	{
		Reporter.log("TC IS PASS__1",true);	
	}
	@Test
	public void test2()
	{
		Reporter.log("TC IS FAIL__2",true);
		Assert.fail();
	}
	@Test
	public void test3()
	{
		Reporter.log("TC IS FAIL__3",true);	
		
	
	}
}
