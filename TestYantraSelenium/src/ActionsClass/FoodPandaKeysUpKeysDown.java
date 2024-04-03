package ActionsClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FoodPandaKeysUpKeysDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.foodpanda.com/");
        Actions act = new Actions(driver);
       
    List<WebElement> eles = driver.findElements(By.xpath("//nav/ul/li[contains(@id,'menu-item') and  //li[contains(@class,'menu-item menu-item-type')]]"));
    
    for(WebElement o : eles)
        {
        	
        	act.keyDown(Keys.CONTROL).perform();
            o.click();
           
           act.keyUp(Keys.CONTROL).perform();
          
        }

             Set<String> allWindowHandles = driver.getWindowHandles();
       for(String o1 :allWindowHandles)
       {
    	   driver.switchTo().window(o1);
    	   if(driver.getTitle().contains("ads"))
    	   {
    		   driver.close();
    		   break;
    	   }
       }
     
        
        
        
        
        
        
        
        
        

	}

}
