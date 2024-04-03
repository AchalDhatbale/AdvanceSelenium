package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.instagram.com/?hl=en");
      
          WebElement submit = driver.findElement(By.xpath("//button[.='Log in']"));
        System.out.println(submit.isEnabled());
        System.out.println(submit.getTagName());
        System.out.println(submit.isDisplayed());
     
      
      
	}

}
