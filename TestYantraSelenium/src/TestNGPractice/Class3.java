package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups="smoke")
	public void redlabel()
	{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://delhidutyfree.co.in/default/jw-red-label.html");
	}
	

}
