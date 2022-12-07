package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic1 
{
	@Test
	public void test1()
	{
		Reporter.log("TC IS PASS",true);	
	}
	@Test
	public void test2()
	{
		Reporter.log("TC IS FAIL",true);	
	}
}
