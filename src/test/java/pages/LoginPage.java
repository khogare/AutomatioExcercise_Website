package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	

	WebDriver driver;
	WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    
    By loginText = By.xpath("//h2[contains(text(),'Login to your account')]");
    By lgn_email= By.xpath("//input[@data-qa='login-email']");
    By lgn_pass=By.xpath("//input[@data-qa='login-password']");
    By lgn_btn= By.xpath("/html/body/section/div/div/div[1]/div/form/button");
    By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
    
    public boolean isLoginTextVisible() {
    //	return driver.findElement(loginText).isDisplayed();
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(loginText)).isDisplayed();
    }
    
    public void EnterLoginEmail() {
    	//driver.findElement(lgn_email).sendKeys("Rashmi");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(lgn_email)).sendKeys("Rashmi");
    	
    }
    public void EnterLoginPass() {
    	//driver.findElement(lgn_email).sendKeys("Ray@1708");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(lgn_pass)).sendKeys("Ray@1708");
    }
    
    public void clickLoginBtn() throws InterruptedException {
    	
    	WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(lgn_btn));

        // 🔥 Handle ads / overlay issue
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
        Thread.sleep(3000);
        
    	//driver.findElement(lgn_btn).click();
    	//wait.until(ExpectedConditions.visibilityOfElementLocated(lgn_btn)).click();
    }

    public boolean isLoggedIn() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInText)).isDisplayed();
    }
    


}
