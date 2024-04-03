package BatchExecutaion;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho1 {

	@Test
    public void meesho()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.meesho.com/");
	}
	
	
	
	
	
	
	
	
	
}
