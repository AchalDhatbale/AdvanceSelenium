package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	
	@Test(groups="smoke")
	public void parle()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://parleproducts.com/");
	}
	

}
