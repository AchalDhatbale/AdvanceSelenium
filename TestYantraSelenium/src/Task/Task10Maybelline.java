package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10Maybelline {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.maybelline.co.in");
        String a = driver.getWindowHandle();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.get("https://www.nykaafashion.com");
       
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Men")).click();
        Thread.sleep(2000);
        Set<String> allIds = driver.getWindowHandles();
        for(String id : allIds)
        {
        	driver.switchTo().window(id);
        	
        	if(driver.getTitle().contains("Men"))
        	{
        		
        		driver.findElement(By.partialLinkText("Careers")).click();
        	}
        }
      //  driver.findElement(By.partialLinkText("Careers")).click();
        Thread.sleep(2000);
       
        driver.switchTo().window(a);
        Thread.sleep(2000);
        driver.close();
        
	}

}
