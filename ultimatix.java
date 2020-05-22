package test;
import java.io.File;
import java.lang.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ultimatix {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\windows\\\\Desktop\\\\selenium drivers\\\\chromedriver.exe");
	   WebDriver shm = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(shm, 20);

	   shm.get("https://www.ultimatix.net"); 
	   shm.findElement(By.xpath("//*[@id=\'form1\']")).sendKeys("1707395");
	   shm.findElement(By.xpath("//*[@id=\'proceed-button\']")).click();

	   WebElement pswrd = shm.findElement(By.xpath("//*[@id=\'password-btn\']"));
       
		wait.until(ExpectedConditions.elementToBeClickable(pswrd));

	   
	   pswrd.click();	 
	   shm.findElement(By.xpath("//*[@id=\'password-login\']")).sendKeys("Guddi@1976");
	
	   shm.findElement(By.xpath("//*[@id=\'form-submit\']")).click();
	   
	  shm.findElement(By.xpath("//*[@id=\"trendindDiv\"]")).click(); 
	   
	  WebElement myl = shm.findElement(By.xpath("//*[@id=\'learnHeadBtn\']"));
	  wait.until(ExpectedConditions.elementToBeClickable(myl));
		myl.click();
		

	}
	
}
