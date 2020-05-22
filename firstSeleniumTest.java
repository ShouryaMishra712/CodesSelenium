package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSeleniumTest {

	public static void main(String[] args) 
	{
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
    	driver1.get("https://www.google.com");
    	driver1.get("https://www.ultimatix.net");
    	driver1.findElement(By.id("form1")).sendKeys("1707395");
        driver1.findElement(By.id("proceed-button")).click();
        driver1.findElement(By.id("password-btn")).click();
        driver1.findElement(By.id("password-login")).sendKeys("Yogesh@1974");
        driver1.findElement(By.id("form-submit")).click();
        driver1.findElement(By.id("uam_Modal")).click();
        driver1.findElement(By.id("logoutbutton")).click();
        driver1.quit();
	}

}


