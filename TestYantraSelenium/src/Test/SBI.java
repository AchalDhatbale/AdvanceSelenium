package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.Select;

public class SBI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
        
        driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
        driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
       
        
        Set<String> allwindowHandles = driver.getWindowHandles();
        for(String handle: allwindowHandles)
        {
        driver.switchTo().window(handle);
        }
 	  
      Dimension size = driver.manage().window().getSize();
      int height = size.getHeight();
      int width = size.getWidth();
  	  
      Dimension size1 = new Dimension(height+100,width+100);
	  driver.manage().window().setSize(size1);
	  
	  driver.findElement(By.id("nextStep")).click();
        
	   WebElement username = driver.findElement(By.id("userName"));
	   
	   //invalid username
      username.sendKeys("vgf3651");
	  WebElement submit = driver.findElement(By.name("Submit"));
	  submit.click();
	  Alert alert = driver.switchTo().alert();
	  String msg = alert.getText();
	System.out.println("popup message when we entered wrong username is = "+msg);
	  alert.accept();
	  
	  //valid username 
	  username.clear();
	  username.sendKeys("Achal");
	  driver.findElement(By.name("Submit")).click();
	  Alert alert2 = driver.switchTo().alert();
	  String msg2 = alert2.getText();
	  alert2.accept();
	  System.out.println("popup message when we entered valid Account no. is = "+msg2);

	  
	  //invalid account no.
      WebElement AccNo = driver.findElement(By.id("accountNo"));
      AccNo.sendKeys("bdfgky0348u3jedjer");
      submit.click();
      Alert alert1 = driver.switchTo().alert();
	  String msg1 = alert1.getText();
	  alert1.accept();
	  System.out.println("popup message when we entered invalid Account no. is = "+msg1);
	 
	  //valid account no.
	  AccNo.clear();
	  AccNo.sendKeys("98765432109");
//	  Alert alert4 = driver.switchTo().alert();
//	  String msg4 = alert4.getText();
//	  alert4.accept();
//	  System.out.println("popup message when we entered valid Account no. is = "+msg4);
	  
	
	
	WebElement CountryDropdown = driver.findElement(By.id("selCountry"));
	Select sel = new Select(CountryDropdown);
	sel.selectByValue("91");
	  
	  //Invalid Mobile NO.
	  WebElement MobileNo = driver.findElement(By.name("mobileNo"));
	  MobileNo.sendKeys("9876543210345");
	  submit.click();
	  Alert alert3 = driver.switchTo().alert();
	  String msg3 = alert3.getText();
	  System.out.println("popup message when we entered invalid Mobile no. is = "+msg3);
	  alert3.accept();
	  
	  //valid mobile no.
	  MobileNo.clear();
	  MobileNo.sendKeys("9876543210");
//	  Alert alert5 = driver.switchTo().alert();
//	  String msg5 = alert5.getText();
//	  alert5.accept();
//	  System.out.println("popup message when we entered valid Mobile no. is = "+msg5);
//	  
	  //invalid DOB
	  WebElement DOB = driver.findElement(By.id("datepicker5"));
	  DOB.sendKeys("2198673581");
	  submit.click();
	  Alert alert6 = driver.switchTo().alert();
	  String msg6 = alert6.getText();
	  System.out.println("popup message when we entered invalid DOB no. is = "+msg6);
	  alert6.accept();
	  
	  //valid DOB
	  DOB.clear();
	  DOB.sendKeys("21/03/2000");
	  submit.click();
	  Alert alert7 = driver.switchTo().alert();
	  String msg7 = alert7.getText();
	  System.out.println("popup message when we entered invalid Valid DOB is = "+msg7);
	  alert7.accept();
	  
	  
	  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
