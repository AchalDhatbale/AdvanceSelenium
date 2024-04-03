package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.woodenstreet.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dining & Kitchen")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Modular Kitchen")).click();
      


	}

}
