package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assert 
{
	private WebDriver driver;
	@Test
	public void test1()
	{
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.instagram.com");
	String title=driver.getTitle();
	
	org.testng.Assert.assertEquals(title, "Instagram");
	System.out.println("123");
}
}