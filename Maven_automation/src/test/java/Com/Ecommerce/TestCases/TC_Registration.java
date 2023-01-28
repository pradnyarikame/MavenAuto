package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_Ecommerce_Registration;
import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_Registration extends Ecommerce_BaseClass {
	
	@Test
	public void Registration() throws IOException {
		
		TC_Ecommerce_Registration TER=new TC_Ecommerce_Registration();
		TER.RegistrationForm();
		TER.SetFirstName("somanj");
		TER.SetLastNAme("Thetelm");
		TER.SetEmail("soma123@gmail.com");
		TER.SetPassword("9876543");
		TER.SetConfirmPassMessage("9876543");
		TER.Submit();
		
		boolean test=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed();
		
		if(test==true) {
			logger.info("user created");
			AssertJUnit.assertTrue(true);
		}
		else {
			logger.info("User creation failed");
			getScreenshotAs("Registration");
			AssertJUnit.assertTrue(false);
		}
	}

}
