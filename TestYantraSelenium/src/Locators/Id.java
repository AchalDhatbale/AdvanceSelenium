package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("achald2001@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Pranjal@10");
        Thread.sleep(1000);
        driver.findElement(By.id("RememberMe")).click();
        Thread.sleep(1000);
       
        
}
}