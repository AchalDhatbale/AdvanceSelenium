package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InfiniteForLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions act = new Actions(driver);
        driver.get("https://onepagelove.com");
       
        for(;;) {
        	try
        	{
        		driver.findElement(By.linkText("Config")).click();
        		break;
        	
        	}
        	catch(NoSuchElementException n)
        	{
        	     act.scrollByAmount(0,700).perform();
        	}
        	catch(ElementClickInterceptedException n)
        	{

        		driver.findElement(By.linkText("Config")).click();
        		break;
        	}
         
        }
        
        
        
        
        
        
	}

}
