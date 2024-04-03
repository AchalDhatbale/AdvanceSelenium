package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       //Alert popup
       driver.get("https://demowebshop.tricentis.com/");
       driver.findElement(By.xpath("//input[@value='Search']")).click();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       String msg = alert.getText();
       System.out.println(msg);
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
