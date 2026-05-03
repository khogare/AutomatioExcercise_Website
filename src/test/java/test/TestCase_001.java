package test;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUp_Main;
import pages.SignUpPage_User;
import pages.SignUpPage_User;


public class TestCase_001 extends BaseTest{

    @Test
    public void signupTest() throws InterruptedException {

        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

       SignUp_Main signup_details = new SignUp_Main(driver);    
       signup_details.enterName("Rashmi");
       signup_details.enterEmail("rashmi" + System.currentTimeMillis() + "@gmail.com");
       signup_details.clickSignup();

        SignUpPage_User signup = new SignUpPage_User(driver);
        signup.fillDetails();
        //signup.fillDetails();
        signup.clickCreateAccount();
    }

}

