package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;


	
	@Test
	public class Sign_in extends TestBase
	{
		public void signin()
		{
			WebElement signin_account=driver.findElement(By.xpath(or.getProperty("signin_account_xpath")));
			//WebElement signin=driver.findElement(By.xpath(or.getProperty("signin")));
			signin_account.click();
			
			WebElement email_input=driver.findElement(By.xpath(or.getProperty("email_input")));
			email_input.click();
			email_input.sendKeys("mahimayadowansi@gmail.com");
			
			WebElement email_continue=driver.findElement(By.xpath(or.getProperty("email_continue_btn")));
			email_continue.click();
			
			WebElement password_input=driver.findElement(By.xpath(or.getProperty("password_input_box")));
			password_input.click();
			password_input.sendKeys("Mahima2708@");
			
			WebElement signin_btn=driver.findElement(By.xpath(or.getProperty("signin_btn")));
			signin_btn.click();
			
		}
	}


