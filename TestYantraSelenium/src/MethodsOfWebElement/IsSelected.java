package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demowebshop.tricentis.com/cart");
      
        WebElement chkbox = driver.findElement(By.xpath("//input[@value='3729342']"));
        System.out.println(chkbox.isSelected());
        chkbox.click();
        System.out.println(chkbox.isSelected());
        //not completed
	}

}
