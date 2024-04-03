package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12SBI {

	public static void main(String[] args) throws InterruptedException {
		//continue to login -- forgot password link --- fill all details 
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://www.onlinesbi.sbi/");
        driver.findElement(By.linkText("LOGIN")).click();
      
        driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
  
        driver.findElement(By.linkText("Forgot Username / Login Password ")).click();
     
        driver.findElement(By.id("nextStep")).click();
        //userName id 
        //not completed
        
        
	}

}
