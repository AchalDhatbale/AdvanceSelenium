package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	Actions a1 = new Actions(driver);
	WebElement passTB = driver.findElement(By.id("password"));
	passTB.sendKeys("122344566");
	Thread.sleep(1000);
	a1.moveToElement(passTB, 296, 0).click().perform();
	
	
	
	//296
	
	}

}
