package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;    
public class AutoITFileUpload {                
    public static void main(String[] args) throws IOException, InterruptedException {                                
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    
    driver.get("https://smallpdf.com/word-to-pdf");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
    Runtime.getRuntime().exec("C:\\Users\\windows\\Desktop\\AutoIT\\FileUpload.exe");  }
}
