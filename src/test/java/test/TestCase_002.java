package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import base.BaseTest;

public class TestCase_002 extends BaseTest {
	
	@Test
	public void loginUpTest() throws InterruptedException {
	
		//verify Home Page
	    HomePage home = new HomePage(driver);
        home.clickSignupLogin();
        
        //Enter Login details
	    LoginPage login=new LoginPage(driver);
	    Assert.assertTrue(login.isLoginTextVisible()); // verify Login to test
	    login.EnterLoginEmail();   //Enter user Email
	    login.EnterLoginPass();    //Enter user password
	    login.clickLoginBtn();     // click on login button

}
}
