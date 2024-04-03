package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class COPYandPASTE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement FN = driver.findElement(By.id("FirstName"));
         FN.sendKeys("ACHAL");
         FN.sendKeys(Keys.CONTROL+"a");
         FN.sendKeys(Keys.CONTROL+"c");
         
         WebElement LN = driver.findElement(By.id("LastName"));
         LN.sendKeys(Keys.CONTROL+"v");
	}

}
