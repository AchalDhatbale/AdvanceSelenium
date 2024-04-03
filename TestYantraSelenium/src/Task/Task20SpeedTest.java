package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20SpeedTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.speedtest.net/");
       WebElement frame = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0']"));
	driver.switchTo().frame(frame);
	Thread.sleep(1000);
	driver.findElement(By.id("cbb")).click();
	
	
	
	}

}
