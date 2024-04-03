package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement ele = driver.findElement(By.xpath("//input[@name='custom_gender']"));
        driver.executeScript("arguments[0].value='Data Entered'",ele);
        
        
        
        
	}

}
