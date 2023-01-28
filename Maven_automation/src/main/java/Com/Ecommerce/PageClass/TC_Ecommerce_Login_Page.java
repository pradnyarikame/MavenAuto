package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_Ecommerce_Login_Page extends Ecommerce_BaseClass {
	
	//public static WebDriver driver;
	
	public TC_Ecommerce_Login_Page() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "Email")
	public WebElement Username;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement LoginBtn;
	
	
public void SetUsername(String Uname) {
		
		Username.sendKeys(Uname);		
	}
	public void SetPassword(String Pass) {
		Password.sendKeys(Pass);
	}
	public void ClickButton() {
		LoginBtn.click();

}
	}
