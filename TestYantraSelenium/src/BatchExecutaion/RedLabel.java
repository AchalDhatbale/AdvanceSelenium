package BatchExecutaion;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedLabel {
	

    public void RedLabel123()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://delhidutyfree.co.in/default/jw-red-label.html");
	}


}
