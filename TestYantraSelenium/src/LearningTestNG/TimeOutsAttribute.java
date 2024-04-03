package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutsAttribute 
{
	@Test(timeOut = 2000)
	    public void hindustan()
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       driver.get("https://www.hindustanpencils.com/#");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


