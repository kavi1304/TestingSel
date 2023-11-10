package first;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Sel1 
{
 public static void main(String[] args) throws InterruptedException
 {
	   ChromeOptions o = new ChromeOptions();
	   o.addArguments("--disable-notifications");
	   
	   
	   System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
	   WebDriver driver=new ChromeDriver(o);
 	   driver.get("https:/healthrx--uatt.my.salesforce.com/");
 	   driver.manage().window().maximize();
 	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 	 
 	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("akshat.garg@bajajfinserv.in.uat");
 	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bajaj@112233");
 	   driver.findElement(By.xpath("//input[@id='Login']")).click();
 	   Thread.sleep(5000);
 	    
 	   
 	  Actions act = new Actions(driver);
 	  
 	   WebElement newbutton=driver.findElement(By.xpath("//a[@title='New']//div[text()='New']/../../..//li[@class='slds-button slds-button--neutral']"));	  
       act.doubleClick(newbutton).perform();
 	   //driver.findElement(By.xpath("//div[@class='actionBody']//h2[text()='New Lead: Customer']")).isDisplayed();
 	   
 	   
// 	   WebDriverWait wt = new WebDriverWait(driver,5);
 	  
 	   
 	   //WebElement element = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='forceChangeRecordTypeFooter']//span[text()='Next']")));
 	   driver.findElement(By.xpath("//span[text()='Next']/../..//button[@class='slds-button slds-button--neutral slds-button slds-button_brand uiButton']")).click();
 	   driver.findElement(By.xpath("//label[text()='First Name']/..//input[@class='slds-input']")).sendKeys("fvgh");
 	  // driver.close();
 	   
 	   
 }
}
