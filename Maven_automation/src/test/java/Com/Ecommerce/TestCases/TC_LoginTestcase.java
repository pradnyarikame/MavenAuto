package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_LoginTestcase  extends Ecommerce_BaseClass{
	//public static WebDriver driver;


	@Test
	public void LoginTestCase() throws InterruptedException, IOException {
		logger.info("Open e commercr URL");
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		Thread.sleep(3000);
		
		TEL.SetUsername(username);
		logger.info("Enter username");
		Thread.sleep(3000);
		
		TEL.SetPassword(password);
		logger.info("Enter password");
		
		Thread.sleep(3000);
		
		TEL.ClickButton();
		logger.info("Click on loginbutton");
		
	
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("login success");
		}
		else {
			getScreenshotAs("LoginTestCase");
			AssertJUnit.assertFalse(false);
			logger.info("login failed");
		}
		
	}

}
