package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demowebshop.tricentis.com/fiction");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("achald2001@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Pranjal@10");
       driver.findElement(By.cssSelector("input[value='Log in']")).click();
        
        		
        		
        		

	}

}
