package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Class1 {

	
	@Parameters("Bname")
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
