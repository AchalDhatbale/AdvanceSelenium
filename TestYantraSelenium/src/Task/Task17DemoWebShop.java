package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task17DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://demowebshop.tricentis.com/");
         driver.findElement(By.xpath("//a[contains(text(),'14.1-inch Laptop')]/../../..//input[@value='Add to cart']")).click(); 
         Thread.sleep(3000);
      driver.findElement(By.partialLinkText("Gift Cards")).click();
        //not completed
      
        
        
	}

}
