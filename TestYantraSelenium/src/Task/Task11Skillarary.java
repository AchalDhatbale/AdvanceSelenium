package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11Skillarary {
//skillary change lanaguage and login 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.skillrary.com");
        driver.findElement(By.linkText("SPANISH")).click();
      driver.findElement(By.linkText("ENGLISH")).click();
     driver.findElement(By.linkText("SIGN IN")).click();
     
     driver.findElement(By.name("email")).sendKeys("achald2001@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.name("password")).sendKeys("Pranjal@10");
     Thread.sleep(2000);
     driver.findElement(By.name("captcha")).sendKeys("TYSS123");
   
     driver.findElement(By.id("usertype_yes")).click();
   
     driver.findElement(By.name("remember")).click();
     
     
        
	}

}
