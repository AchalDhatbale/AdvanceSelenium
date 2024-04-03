package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demowebshop.tricentis.com/fiction");
       //for registation
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
      driver.findElement(By.id("FirstName")).sendKeys("Riyaaan");
        driver.findElement(By.id("LastName")).sendKeys("Royen");
        driver.findElement(By.id("Email")).sendKeys("riyaaan123@gmail.com");
          driver.findElement(By.id("Password")).sendKeys("Riyaaan@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Riyaaan@123");
      driver.findElement(By.id("register-button")).click();
      
       //driver.findElement(By.id("register-button")).click();
        
//       driver.findElement(By.linkText("Electronics")).click();
//       
//       driver.findElement(By.cssSelector("img[alt='Picture for category Camera, photo']")).click();
//     
     
    driver.findElement(By.cssSelector(" input[value='Continue']")).click();
    driver.findElement(By.cssSelector(" input[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/31/1/1    ');return false;\"]")).click();
    Thread.sleep(5000);
   
    driver.findElement(By.linkText("Shopping cart")).click();
   
    driver.findElement(By.cssSelector("input[name='removefromcart']")).click();
   
   driver.findElement(By.cssSelector(" input[value='Update shopping cart']")).click();
        
       
       
        
        

	}

}
