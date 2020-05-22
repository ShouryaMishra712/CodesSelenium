package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		// Selecting round trip radio button
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://easemytrip.com");	
	  WebElement ddate = driver.findElement(By.id("ddate"));
	  ddate.click();
	  WebElement date1 = driver.findElement(By.id("fiv_5_29/05/2020"));
	  date1.click();
	  
	  WebElement rdate = driver.findElement(By.id("rdate"));
	  rdate.click();
	  WebElement date2 = driver.findElement(By.id("trd_0_14/06/2020"));
	  date2.click();
	  
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).click();
	  WebDriverWait wait= new WebDriverWait(driver,120);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BtnBookNow")));
	  driver.close();
	  // Selecting from city
	  
	  
	     
	      

	}

}
