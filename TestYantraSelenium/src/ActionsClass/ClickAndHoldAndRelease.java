package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndRelease {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
        driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
        WebElement from = driver.findElement(By.xpath("//span[@class='irs-slider from']"));
        WebElement to = driver.findElement(By.xpath("//span[@class='irs-slider to']"));
        
        Actions a = new Actions(driver);
        a.clickAndHold(from).perform();
        a.moveByOffset(3,0).perform();
        a.release(from).perform();
        
        a.clickAndHold(to).perform();
        a.moveByOffset(-3,0).perform();
        a.release(to).perform();

    
        

        
        
        
        
	}

}
