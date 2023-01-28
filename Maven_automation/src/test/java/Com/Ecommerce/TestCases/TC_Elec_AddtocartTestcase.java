package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.PageClass.TC_Electronics_Addtocart;
import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_Elec_AddtocartTestcase extends Ecommerce_BaseClass {
	@Test
	public void AddProduct() throws InterruptedException {
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
		Thread.sleep(3000);
		
		TC_Electronics_Addtocart CAM=new TC_Electronics_Addtocart();
		
		Actions Act=new Actions(driver);
		WebElement Electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1] "));
		
		Act.moveToElement(Electronics).perform();
		logger.info("Mouseover on Computer");
		
		CAM.Camera();
		logger.info("click on Camera");
		
		CAM.nikoncamera();
		logger.info("click on Nikon");
		
		CAM.BlackColour();
		logger.info("click on black nickon");
		
		CAM.AddToCart();
		logger.info("Added to cart");
		
		CAM.successMessage();
		logger.info("success message display");
		
		CAM.CLOSET();
		logger.info("click on close tab");
				
		
		
		
	}		
		

}
