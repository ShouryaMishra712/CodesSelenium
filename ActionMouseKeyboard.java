package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionMouseKeyboard {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",  "C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
    
    String baseUrl = "http://www.facebook.com/"; 
    WebDriver driver = new ChromeDriver();
    driver.get(baseUrl);
    WebElement txtUsername = driver.findElement(By.id("email"));
    Actions builder = new Actions(driver);  // STEP-1
    
    Action seriesOfActions = builder    //STEP-2
        .moveToElement(txtUsername)
        .click()
        .keyDown(txtUsername, Keys.SHIFT)
        .sendKeys(txtUsername, "hello")
        .keyUp(txtUsername, Keys.SHIFT)
        .doubleClick(txtUsername)
        .contextClick()
        .build();             //STEP-3
    
    driver.close();
    }
    }
