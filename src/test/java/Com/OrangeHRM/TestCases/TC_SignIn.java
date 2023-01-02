package Com.OrangeHRM.TestCases;

import java.io.IOException;

 
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.OrangeHRM.BaseClass.OrangeHRM_BaseClass;
import Com.OrangeHRM.PageObject.OrangeHRM_SignInPage;
 

public class TC_SignIn extends OrangeHRM_BaseClass{

	@Test
	public void SignInTest() throws InterruptedException, IOException {
		OrangeHRM_SignInPage SI=new OrangeHRM_SignInPage();
		
		Thread.sleep(2000);
		SI.SetUsername("Admin");
		log.info("Username Entered.");
		SI.SetPassword("admin123");
		log.info("Password Entered.");
		SI.LoginButton();
		log.info("Clicked Next Button.");
		 
		Thread.sleep(3000);
		String ExpTitle="OrangeHRM";
		String ActTitle=driver.getTitle();
		Assert.assertEquals(ExpTitle, ActTitle,"Title Verified.");
		log.info("Test Pass.");
		Thread.sleep(3000);
	}
}
