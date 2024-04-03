package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillraryExecuteSynScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions act = new Actions(driver);
        driver.get("https://demoapp.skillrary.com/");
       WebElement disableBox = driver.findElement(By.xpath("//input[@class='form-control']"));
        driver.executeScript("arguments[0].value='Hi Welcome';",disableBox);
        
        
        
        
        
        
        
        
        
        
	}

}
