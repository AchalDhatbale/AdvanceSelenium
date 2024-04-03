package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://www.ilovepdf.com/pdf_to_word");
        WebElement ele = driver.findElement(By.xpath("//input[@tabindex='-1']"));      
        ele.sendKeys("C:\\Users\\91860\\Desktop\\Achal CV\\Resume.SE-Achal.pdf");
        
        
        
        
        
        
	}

}
