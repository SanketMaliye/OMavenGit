package Com.OrangeHRM.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.BaseClass.OrangeHRM_BaseClass;
 

public class OrangeHRM_SignInPage extends OrangeHRM_BaseClass{

	public OrangeHRM_SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") public WebElement Username;
	@FindBy(name="password") public WebElement Password;
	@FindBy(xpath="//button[@type=\"submit\"]") public WebElement Login;
	
	public void SetUsername(String U) {
		Username.sendKeys(U);
	}
	public void SetPassword(String P) {
		Password.sendKeys(P);
	}
	public void LoginButton() {
		Login.click();
	}
	 
}
