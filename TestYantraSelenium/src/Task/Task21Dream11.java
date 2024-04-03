package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21Dream11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.dream11.com/");
        Thread.sleep(1000);
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8465982572");
        
	}

}
