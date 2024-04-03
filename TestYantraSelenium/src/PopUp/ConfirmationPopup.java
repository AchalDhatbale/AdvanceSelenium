package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.switchTo().frame("iframeResult");
        //promt popup
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(2000);
       Alert Popup = driver.switchTo().alert();
       Popup.sendKeys("Achal");
       String msg = Popup.getText();
       System.out.println(msg);
      // Popup.accept();
       Thread.sleep(2000);
       Popup.dismiss();
        
        

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
