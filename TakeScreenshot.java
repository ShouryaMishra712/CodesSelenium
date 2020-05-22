package test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
public class TakeScreenshot {
    public static void main(String args[]) throws Exception{
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
        driver = new ChromeDriver();
        //goto url
        driver.get("https://amazon.com");
        //Call take screenshot function
        takeSnapShot(driver, "D://test1.png");
        driver.get("https://facebook.com");
        takeSnapShot(driver, "D://test2.png");
    }
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
        
//from Virendra (Faculty) to All Participants:
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
