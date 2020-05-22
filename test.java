package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
    WebDriver driver1 = new ChromeDriver(); 	
    driver1.get("https://www.udemy.com");
	driver1.findElement(By.xpath("//*[@id=\'search-field-home\']")).sendKeys("selenium");
	driver1.findElement(By.className("udi udi-search")).click();
	}
}
