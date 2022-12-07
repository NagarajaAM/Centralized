package login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script extends Generic_Script
{
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajuam1998@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("80505569");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
