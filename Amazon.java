package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\windows\\eclipse-workspace\\TestNG1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebDriverWait wait= new WebDriverWait(driver,500);
		WebElement deal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		deal.click();
		
		driver.findElement(By.className("a-expander-prompt")).click();
        
		WebElement checkbox1 = driver.findElement(By.cssSelector("#widgetFilters > div:nth-child(1) > div.a-row.a-expander-container.a-expander-inline-container > div > span:nth-child(2)"));		
        wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
        checkbox1.click();
		 Select sort = new Select(driver.findElement(By.xpath("//*[@id=\'FilterItemView_sortOrder_dropdown\']/div/span[2]/span/span/span/span/span")));
		sort.selectByIndex(2);
		
		// TODO Auto-generated method stub

	}

}
