package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 public WebDriver driver;
		
	 @BeforeMethod
     public void setup () {
    	 
    	 // Lunch browser
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	 
    	 //Navigate to URL
    	 
    	 driver.get("https://automationexercise.com/");
    	 }
	 
	 
	    @AfterMethod
	     public void teardown() {
	    	 driver.quit();
	     }
}