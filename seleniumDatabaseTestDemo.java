package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDatabaseTestDemo 
{
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


    @Before
    public void setUp() throws Exception
    {
        System.out.println("We are calling @Before............");    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
        driver = new ChromeDriver();
        //url = "file:///D:/ECLIPSE/workspace_eclipseclassic/ConnectDB/src/com/modules/HTML5Demo.html”;
        url="https://login.yahoo.com";
        driver.get(url);
    }

    @Test
    public void CreateDB() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, InterruptedException
    {
        System.out.println("We are calling @Test............");    
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
        String name = result.getString("userName");
        
        driver.getCurrentUrl();
        //WebElement a = driver.findElement(By.id("txtID"));
        //a.sendKeys(id);
        //WebElement b = driver.findElement(By.id("txtInfo"));
        Thread.sleep(4000);
        
    driver.findElement(By.cssSelector("#login-username")).sendKeys(name);
        //b.sendKeys(name);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#login-signin")).click();
        Thread.sleep(4000);
        System.out.print("Passed");
        }
        }

    @After
    
    public void tearDown() throws SQLException{
        System.out.println("We are calling @After............");    
        driver.close(); 
        con.close();
        }
    
    }

