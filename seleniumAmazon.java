package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumAmazon {
	static Connection con = null;
    // Statement object
    private static Statement stmt = null;
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/testshm";   
    // Constant for Database Username
    public static String DB_USER = "root";
    // Constant for Database Password
    public static String DB_PASSWORD = "8878778425";
    WebDriver driver;
    String url ="";
    ResultSet result = null;
    ResultSet result1 = null;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("We are calling @Before............");    
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        driver = new ChromeDriver();
        //url = "file:///D:/ECLIPSE/workspace_eclipseclassic/ConnectDB/src/com/modules/HTML5Demo.html”;
        url="https://amazon.com/sign-in";
        driver.get(url);
    }

    @Test
    public void firstTest() throws Exception
    {
        System.out.println("We are calling first Test............");    
        //Prepare connection
        String url1 ="jdbc:mysql://localhost:3306/testshm";
        
        // Load Microsoft SQL Server JDBC driver
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass).newInstance();
        
        //Get connection to DB
        con = DriverManager.getConnection(url1,"root","8878778425");
        
        //Create Statement
        stmt = (Statement) con.createStatement();
        
        // method which returns the requested information as rows of data
        result = stmt.executeQuery("select * from userinfo");
        if(result.next())
        {
        //String id = result.getString("userID");
        String id = result.getString("useremailID");
        String pswrd = result.getString("userPswrd");
        driver.getCurrentUrl();
        //WebElement a = driver.findElement(By.id("txtID"));
        //a.sendKeys(id);
        //WebElement b = driver.findElement(By.id("txtInfo"));
        Thread.sleep(4000);
        
    driver.findElement(By.id("ap_email")).sendKeys(id);
    
    takeSnapShot(driver, "D://Selenium//emailId.png");
    
    driver.findElement(By.id("continue")).click();
    
    driver.findElement(By.id("ap_password")).sendKeys(pswrd);
    //b.sendKeys(name);
    takeSnapShot(driver, "D://Selenium//password.png");
        Thread.sleep(4000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(4000);
        System.out.println("first Test Passed");
        }
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[4]/div[1]/div/div/ul/li[3]/span/a")).click(); 
        
        WebDriverWait wait = new WebDriverWait(driver,3000);
        
        WebElement edit = driver.findElement(By.xpath("//*[@id=\"customer-profile-name-header\"]/div[6]/a/span/span/button"));
        
        wait.until(ExpectedConditions.elementToBeClickable(edit));
         
        edit.click();
        
         
        WebElement name = driver.findElement(By.id("profile_name"));
        
        String uname = name.getAttribute("value");
        
        WebElement bio = driver.findElement(By.name("profile[personal_description]"));
        
        bio.clear();
        
        WebElement occupation = driver.findElement(By.name("profile[occupation]"));
        
        occupation.clear();
        
        WebElement location = driver.findElement(By.name("profile[location]"));
        
        String address = location.getAttribute("value");
    
        System.out.println("Previous Name = "+uname);
        System.out.println("Previous Address = "+address);
       
        name.clear();
        location.clear();
        
        result = stmt.executeQuery("select * from userinfo");
       if(result.next())
       {
    	   String userN = result.getString("userName");
    	   String userBio = result.getString("bio");
    	   String userOccupation = result.getString("occupation");
    	   String userA= result.getString("userAddress");
    	   name.sendKeys(userN);
    	   takeSnapShot(driver, "D://Selenium//profilePic.png");
    	   Thread.sleep(3000);
    	   bio.sendKeys(userBio);
    	   occupation.sendKeys(userOccupation);
    	   location.sendKeys(userA);
    	   System.out.println("Added dedicated entries");
       }
       
       Thread.sleep(5000);

       takeSnapShot(driver, "D://Selenium//userInformation.png");
       
       WebElement save = driver.findElement(By.xpath("//*[@id=\"save-public-activity\"]/span/input"));
       
       wait.until(ExpectedConditions.elementToBeClickable(save));
       
       save.click();
       
       WebElement back = driver.findElement(By.id("a-autoid-0-announce"));
       
       wait.until(ExpectedConditions.elementToBeClickable(back));
       
       back.click();
       
       WebElement profileP = driver.findElement(By.xpath("//*[@id=\"avatar-image\"]"));
        
       wait.until(ExpectedConditions.elementToBeClickable(profileP));
       
       profileP.click();
       
       driver.findElement(By.xpath("//*[@id=\"a-popover-content-3\"]/div/div/div/label/span")).click();
       
       Runtime.getRuntime().exec("C:\\Users\\windows\\Desktop\\AutoIT\\FileUpload.exe");
       
           
       Thread.sleep(30000);
   
       takeSnapShot(driver, "D://Selenium//profilePic.png");

       driver.findElement(By.xpath("//*[@id=\"profile_v5\"]/div/div/div[5]/div[1]/div[3]/div[3]/div/a")).click();
    
       driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[4]/div[1]/div/div/ul/li[1]/span/a")).click();
    
       driver.findElement(By.id("ya-myab-plus-address-icon")).click();
   
	   
		  WebElement drpc = driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId"));
		 
		  Select country = new Select(drpc) ;
		  
		  country.selectByVisibleText("India");
		  
		  Thread.sleep(10000);
		  
	      WebElement name1 = driver.findElement(By.name("address-ui-widgets-enterAddressFullName"));
		  name1.clear();
	      
		  WebElement contact = driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber"));
		  contact.clear();
		  
		  WebElement pin = driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode"));
          pin.clear();
		  
          WebElement a1 = driver.findElement(By.name("address-ui-widgets-enterAddressLine1"));
          a1.clear();
          
          WebElement a2 = driver.findElement(By.name("address-ui-widgets-enterAddressLine1"));
          a2.clear();
          
          WebElement city = driver.findElement(By.name("address-ui-widgets-enterAddressCity"));
          city.clear();
          
          result = stmt.executeQuery("select * from usercontact");
          if(result.next())
          {
        	  String uname1 = result.getString("userName");
        	  String contact1 = result.getString("userPhone");
        	  String pin1 = result.getString("userPin");
        	  String ad1 = result.getString("userAddressl1");
        	  String ad2 = result.getString("userAddressl2");
        	  String city1 = result.getString("userCity");
        	  
        	  name1.sendKeys(uname1);
    		  Thread.sleep(3000);

        	  contact.sendKeys(contact1);
    		  Thread.sleep(3000);

        	  pin.sendKeys(pin1);
    		  Thread.sleep(3000);

        	  a1.sendKeys(ad1);
    		  Thread.sleep(3000);

        	  a2.sendKeys(ad2);
    		  Thread.sleep(3000);

        	  city.sendKeys(city1);
          
          }
          
          Thread.sleep(3000);
          
          WebElement drpS = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId"));
      	
	      Select state = new Select(drpS);
	      
	      state.selectByVisibleText("MADHYA PRADESH");
	      
	      Thread.sleep(3000);
	      
	      WebElement drpP = driver.findElement(By.name("address-ui-widgets-addr-details-address-type-and-business-hours"));
	
	      Select pref = new Select(drpP);
	      
	      pref.selectByIndex(1);
	      
   	   takeSnapShot(driver, "D://Selenium//address1.png");

	      
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();

	      Thread.sleep(3000);
	      
         driver.findElement(By.xpath("//*[@id=\"a-autoid-2\"]/span/input")).click();
    
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//*[@id=\"skip-for-now\"]/div/label/i")).click();
    
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//*[@id=\"kyc-xborder-continue-button\"]/span/input")).click();
    
         Thread.sleep(3000);
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
    
      @After
    
    public void tearDown() throws SQLException{
        System.out.println("We are calling @After............");     
        driver.close();
        con.close();
        }
    
}
