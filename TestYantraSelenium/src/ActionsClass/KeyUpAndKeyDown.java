package ActionsClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        driver.get("https://parivahan.gov.in/parivahan/"); 
        Actions act = new Actions(driver);
      List<WebElement> elements = driver.findElements(By.xpath("//li[@data-level='1']"));
        for(WebElement ele : elements)
        {
           act.keyDown(Keys.CONTROL).perform();
           ele.click();
          act.keyUp(Keys.CONTROL).perform();
           
        }
        Set<String> allWindowHandles = driver.getWindowHandles();
        for(String o1 :allWindowHandles)
        {
     	   driver.switchTo().window(o1);
     	   if(driver.getTitle().contains("External Links"))
     	   {
     		   driver.close();
     		   break;
     	   }//dont know completed or not 
        }
       
        

        
        
                  
        
        
        
        
        

        
        
                 
        
        
	}

}
