package TakeScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class OlaScreenShot {
    public static void main(String[] args) throws IOException  {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://www.olacabs.com/");
	       File a = driver.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(a,new File("./Screenshot/ola.jpg"));
	    
	    
	    

	}

}
