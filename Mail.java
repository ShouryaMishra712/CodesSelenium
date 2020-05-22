package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Desktop\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("shm71298@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/span/span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("MYLWCSSCHOOL");
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// TODO Auto-generated method stub

	}

}
