package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(15));

        driver.get("https://www.purplle.com/");
        Actions a = new Actions(driver);
        WebElement ele = driver.findElement(By.linkText("SHOP CATEGORIES"));
        a.moveToElement(ele).perform();
       WebElement mkup = driver.findElement(By.linkText("Makeup"));
       a.moveToElement(mkup).perform();
        driver.findElement(By.linkText("Lipstick")).click();
        
        
	}

}
