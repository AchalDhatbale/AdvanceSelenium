package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class NaukariCom {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://www.zomato.com/india");
        Actions act = new Actions(driver);
       act.scrollByAmount(0,700).perform();
        //it goes upto 700 pixel down
//        WebElement ele = driver.findElement(By.linkText("Haridwar Restaurants"));
//       ScrollOrigin ele1 = ScrollOrigin.fromElement(ele);
//        act.scrollFromOrigin(ele1, 0,100).perform();
        
        
        
        
        
        
        
        
        
        
        
	}

}
