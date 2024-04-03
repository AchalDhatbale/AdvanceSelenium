package SeleniumBasics;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.shoppersstack.com/");
        driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
        driver.findElement(By.id("Check Delivery")).sendKeys("123456");
     
       WebElement chkbox = driver.findElement(By.name("Check"));
     WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));
     explicitWait.until(ExpectedConditions.elementToBeClickable(chkbox));
      chkbox.click();
	}

}
