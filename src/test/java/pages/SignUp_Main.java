package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_Main {
	
	WebDriver driver;

    public SignUp_Main(WebDriver driver) {
        this.driver = driver;
    }


   By name = By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[@data-qa='signup-button']");

    public void enterName(String uname) {
        driver.findElement(name).sendKeys(uname);
    }

    public void enterEmail(String uemail) {
        driver.findElement(email).sendKeys(uemail);
    }

    public void clickSignup() {
        driver.findElement(signupBtn).click();
    }
    

}
