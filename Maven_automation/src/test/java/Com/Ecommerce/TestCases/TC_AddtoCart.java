package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_Ecommerce_AddToCart;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_AddtoCart extends Ecommerce_BaseClass {
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
		
		TC_Ecommerce_AddToCart TEA=new TC_Ecommerce_AddToCart();
		
		Actions Act=new Actions(driver);
		WebElement Computer=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		Act.moveToElement(Computer).perform();
		logger.info("Mouseover on Computer");
		
		TEA.NoteBook();
		logger.info("click on Notebook");
		
		TEA.SelectProduct();
		logger.info("Product selected");
		
		TEA.addTocart();
		logger.info("Add to cart");
		
		TEA.AddedsuccessMessage();
		logger.info("Verified message");
		
		TEA.CLOSE();
		logger.info("Clicked on close tab");
		
		
		
		
		
	}

}
