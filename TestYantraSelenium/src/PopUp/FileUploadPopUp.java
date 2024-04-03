package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://www.naukri.com/registration/createAccount");
        WebElement ele = driver.findElement(By.id("resumeUpload"));
        Actions act = new Actions(driver);
        act.scrollToElement(ele).scrollByAmount(0,200).perform();
        ele.sendKeys("C:\\Users\\91860\\Desktop\\Achal CV\\Resume.SE-Achal.pdf");
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
