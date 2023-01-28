package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.TestClass.Ecommerce_BaseClass;

public class TC_Ecommerce_Registration  extends Ecommerce_BaseClass{
	
	public TC_Ecommerce_Registration() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Register')]") WebElement Registration;
	@FindBy(id="FirstName")WebElement Firstname;
	@FindBy(id="LastName")WebElement Lastname;
	@FindBy(id="Email")WebElement email;
	@FindBy(id="Password")WebElement password;
	@FindBy(id="ConfirmPassword")WebElement confirmPass;
	@FindBy(id="register-button")WebElement Regbutton;
	@FindBy(xpath="//div[contains(text(),'Your registration completed')]")WebElement message;
	
	public void RegistrationForm() {
		Registration.click();
	}
	public void SetFirstName(String name) {
		Firstname.sendKeys(name);
		
	}
	public void SetLastNAme(String name) {
		Lastname.sendKeys(name);
	}
	public void SetEmail(String EmailId) {
	    email.sendKeys(EmailId);
	}
	public void SetPassword(String Pass) {
		password.sendKeys(Pass);
	}
	public void SetConfirmPassMessage( String Confirm) {
		confirmPass.sendKeys(Confirm);
	}
	public void Submit() {
		Regbutton.click();
	}
	public void Regsuccess() {
		
	}
	
	

}
