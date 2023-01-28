package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_Electronics_Addtocart extends Ecommerce_BaseClass {
	
	public TC_Electronics_Addtocart() {
		PageFactory.initElements(driver,this);
	}
	
	//2
	@FindBy(xpath="(//a[contains(text(),'Electronics')] )[1]") public WebElement Elec;
	@FindBy(xpath="(//a[contains(text(),'Camera & photo')])[1] ") public WebElement Cam;
	@FindBy(xpath="//a[contains(text(),'Nikon D5500 DSLR')]")public WebElement nikon;
	@FindBy(xpath="(//button[contains(text(),'Add to cart')])[1]")public WebElement addtocart;
	@FindBy(id=("add-to-cart-button-14"))public WebElement blackclr;
	@FindBy(xpath="//div[@class=\"bar-notification success\"]")public WebElement message;
	@FindBy(xpath="//span[@class=\"close\"]")public WebElement closeTab;
	
	
//	public void Electronics() {
//		Elec.click();
//	}
	public void Camera() {
		Cam.click();
	}
	public void nikoncamera() {
		nikon.click();
	}
	public void AddToCart() {
		addtocart.click();
	}
	public void BlackColour() {
		blackclr.click();
	}
	public void successMessage() {
		message.isDisplayed();
		
	}
	public void CLOSET() {
		closeTab.click();
	}
	
	

}
