package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
//used for tooltip, value that we enetred, alternate name 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
//        to fetch value which we entered
        
//        driver.get("https://www.skillrary.com");
//        driver.findElement(By.linkText("SPANISH")).click();
//        driver.findElement(By.linkText("ENGLISH")).click();
//     driver.findElement(By.linkText("SIGN IN")).click();
//     
//    WebElement email = driver.findElement(By.name("email"));
//    email.clear();
//    email.sendKeys("achald2001@gmail.com");
//    String givenemail = email.getAttribute("value");
//     Thread.sleep(2000);
//     System.out.println(givenemail);
        
        // for alternate name for image 
//        driver.get("https://demowebshop.tricentis.com/fiction");
//       WebElement img = driver.findElement(By.id("main-product-img-45"));
//      String altText = img.getAttribute("alt");
//      System.out.println(altText);
       
     // for tooltip
      driver.get("https://demowebshop.tricentis.com/fiction");
     WebElement img1 = driver.findElement(By.id("main-product-img-45"));
    String title = img1.getAttribute("title");
    System.out.println(title);
     
    
     

	}

}
