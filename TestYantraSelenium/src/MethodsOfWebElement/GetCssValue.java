package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://www.skillrary.com/user/login");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement errormsg = driver.findElement(By.id("email-error"));
        String color = errormsg.getCssValue("color");
        System.out.println(color);

        String weight = errormsg.getCssValue("font-weight");
        System.out.println(weight);
        System.out.println(errormsg.getCssValue("font-family"));

	}

}
