package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignUpPage_User {
	WebDriver driver;
	
	 public SignUpPage_User(WebDriver driver) {
	        this.driver = driver;
	    }
	
	    By titleMr = By.id("id_gender1");
	    By password = By.id("password");
	    By day = By.id("days");
	    By month = By.id("months");
	    By year = By.id("years");
	    By firstName = By.id("first_name");
	    By lastName = By.id("last_name");
	    By address = By.id("address1");
	    By country = By.id("country");
	    By state = By.id("state");
	    By city = By.id("city");
	    By zipcode = By.id("zipcode");
	    By mobile = By.id("mobile_number");
	    By createAccountBtn = By.xpath("//button[@data-qa='create-account']");

	    public void fillDetails() throws InterruptedException {
	    

	    	
	        driver.findElement(titleMr).click();
	        driver.findElement(password).sendKeys("Test@123");

	        driver.findElement(day).sendKeys("10");
	        driver.findElement(month).sendKeys("May");
	        driver.findElement(year).sendKeys("1995");

	        driver.findElement(firstName).sendKeys("Rashmi");
	        driver.findElement(lastName).sendKeys("Test");
	        driver.findElement(address).sendKeys("Mumbai");

	        driver.findElement(country).sendKeys("India");
	        driver.findElement(state).sendKeys("Maharashtra");
	        driver.findElement(city).sendKeys("Mumbai");
	        driver.findElement(zipcode).sendKeys("400001");
	        driver.findElement(mobile).sendKeys("9876543210");
	    }

	    public void clickCreateAccount() {
	    	 driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
	    }

}
