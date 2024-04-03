package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("file:///C:/Users/91860/Downloads/TestPage.html");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        Thread.sleep(10000);
        
        Set<String> AllIds = driver.getWindowHandles();
        String ch ="a";
        for(String id :AllIds )
        {
      	  driver.switchTo().window(id);
      	  
      	    System.out.println(driver.getTitle());
      	    
      	  
      	   
      	    
      	    
      	    
      	  }
       }
        
        
        
        
        
        
        
        
        
        
        
	}


