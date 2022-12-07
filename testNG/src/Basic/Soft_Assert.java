package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert 
{
	private WebDriver driver;
	@Test
	public void test1()
	{
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.instagram.com");
	String title=driver.getTitle();
	SoftAssert soa=new SoftAssert();
	soa.assertEquals(title, "Instagra");
	soa.assertAll();//mandatory ()
	
	System.out.println("123");
	
	driver.close();
}
}