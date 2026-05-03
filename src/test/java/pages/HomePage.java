package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");

    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }
    /*By name = By.name("name");
    By email = By.xpath("//input[@data-qa='login-email']");
    By signupBtn = By.xpath("//button[@data-qa='login-button']");
    
   // public void newUserDetails() {


		public void enterName(String userName) {
			// TODO Auto-generated method stub
			 driver.findElement(name).sendKeys(userName);
		}
		public void enterEmail(String userEmail) {
			// TODO Auto-generated method stub
			 driver.findElement(email).sendKeys(userEmail);
		}
		public void clickSignup() {
		         driver.findElement(signupBtn).click();
	    }*/
    //}
    
}

