package PopUp;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;


public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        LocalDateTime ltd = LocalDateTime.now();
        String MonthName = ltd.getMonth().name();
        MonthName = ""+MonthName.substring(0,1).toUpperCase()+MonthName.substring(1).toLowerCase();
        int year = ltd.getYear();
       int day = ltd.getDayOfMonth();
       
      driver.get("https://www.agoda.com/");
      Thread.sleep(2000);
      try {
        driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
      }
      catch (NoSuchElementException e)
      {
    	  
      }
        driver.findElement(By.xpath("//div[@data-selenium=\"checkInText\"]")).click();
         driver.findElement(By.xpath("//div[text()='December 2023']/..//span[text()='8']")).click();
//   
//        driver.findElement(By.xpath("//div[text()='January 2024']/..//span[text()='9']")).click();
        
        for(;;)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        	try
        	{
        		  driver.findElement(By.xpath("//div[text()='"+MonthName+" "+(year+1)+"']/..//span[text()='"+(day-4)+"']")).click();
        	     
        	        driver.findElement(By.xpath("//div[text()='"+MonthName+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
        		   break;
        	}
        	catch(NoSuchElementException e)
        	{
        		driver.findElement(By.xpath("//button[@aria-label=\"Next Month\"]")).click();
        	}
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
