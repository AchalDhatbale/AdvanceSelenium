package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demowebshop.tricentis.com/fiction");
        driver.findElement(By.linkText("Log in")).click();
         WebElement email = driver.findElement(By.id("Email"));
         email.clear();
        		email.sendKeys("acha354@gmail.com");
        //driver.findElement(By.id("Password")).sendKeys("Prl@10");
   driver.findElement(By.cssSelector("input[value='Log in']")).click();
 
   WebElement text = driver.findElement(By.xpath("//li[text()='No customer account found']"));
    String msg = text.getText();
    System.out.println(msg);
	}

}
