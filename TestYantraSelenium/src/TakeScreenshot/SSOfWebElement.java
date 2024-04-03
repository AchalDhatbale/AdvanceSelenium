package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSOfWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.meesho.com/");
        File a = driver.findElement(By.xpath("//span[text()='Women Ethnic']")).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(a,new File("./Screenshot/meesho.jpg"));
	}

}
