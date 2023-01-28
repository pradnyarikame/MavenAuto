package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.TestClass.Ecommerce_BaseClass;
//1
public class TC_Ecommerce_AddToCart extends Ecommerce_BaseClass {
	
	public TC_Ecommerce_AddToCart() {
		PageFactory.initElements(driver,this);
	}
//2
	@FindBy(xpath="//a[contains(text(),'Computers ')]")public WebElement Com;
	@FindBy(xpath="//a[contains(text(),'Notebooks')] ")public WebElement Notebook;
	@FindBy(xpath="(//a[contains(text(),'Apple MacBook Pro 13-inch')])[1]")public WebElement Selectmacbook;
	@FindBy(xpath="(//button[contains(text(),'Add to cart')])[2]")public WebElement Addtocart;
	@FindBy(xpath="//p[contains(text(),'The product has been added to your')] ")public WebElement Message;
	@FindBy(xpath="//span[@class=\"close\"]")public WebElement Closeicon;
	
	//3
	public void NoteBook() {
		Notebook.click();
	}
	public void SelectProduct() {
		Selectmacbook.click();
	}
	public void addTocart() {
		Addtocart.click();
	}
	public void AddedsuccessMessage() {
		Message.isDisplayed();
		
	}
	public void CLOSE() {
		Closeicon.click();
	}
	
	
}
