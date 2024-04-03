package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task15VTiger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
       
        WebElement usn = driver.findElement(By.id("username"));
        usn.clear();
        usn.sendKeys("sseytthdfes3r");
      
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.clear();
        pwd.sendKeys("sseytthdfes3r");
        
       driver.findElement(By.xpath("//button[text()='Sign in']"));
      
       WebElement msg = driver.findElement(By.id("validationMessage"));
       System.out.println(msg.isDisplayed());
       String text = msg.getText();
       System.out.println(text);
        

	}
}

