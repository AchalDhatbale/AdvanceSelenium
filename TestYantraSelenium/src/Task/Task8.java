package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.shoppersstack.com");
        Thread.sleep(20000);
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Create Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("First Name")).sendKeys("Achal");
        driver.findElement(By.id("Last Name")).sendKeys("Dhatbale");
        driver.findElement(By.id("Phone Number")).sendKeys("9876543882");
        driver.findElement(By.id("Email Address")).sendKeys("achald2001@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Pranjal@10");
        driver.findElement(By.id("Confirm Password")).sendKeys("Pranjal@10");
        driver.findElement(By.id("Terms and Conditions")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("signup_bn5__JLO3F")).click();
        

	}

}
