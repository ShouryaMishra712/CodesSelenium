package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchToFrame_ID {
public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver(); //navigates to the Browser
        driver.get("http://demo.guru99.com/test/guru99home/"); 
        // navigates to the page consisting an iframe
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID
        System.out.println("********We are switch to the iframe*******");
         driver.findElement(By.xpath("html/body/a/img")).click();
          //Clicks the iframe
        Thread.sleep(5000);
          System.out.println("*********We are done***************");
        
        driver.switchTo().parentFrame();
        System.out.println("Focus switched to parent frame.....");
      }
}