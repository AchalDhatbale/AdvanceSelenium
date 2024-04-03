package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AttributesOfTESTNG {
	
	@Test(groups = "Smoke")
	public void meesho()
	{//priority = 2 , invocationCount = 2,threadPoolSize = 2,enabled = false,
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.meesho.com/");
	}
	@Test
	//(priority = 0, invocationCount = 2,threadPoolSize = 3)
	public void zomato()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.zomato.com/india");
	}
	
	@Test(groups = "Smoke")
	//(priority = 1 , invocationCount = 2,threadPoolSize =3)
	public void purple()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.purplle.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
