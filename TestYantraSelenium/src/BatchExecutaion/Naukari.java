package BatchExecutaion;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukari {
	
	@Test
    public void Naukari123()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.naukri.com/registration/createAccount");
	}


}
