package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demowebshop.tricentis.com/fiction");
        driver.findElement(By.linkText("Log in")).click();
         WebElement email = driver.findElement(By.id("Email"));
         email.clear();
        		email.sendKeys("achald201gmail.com");
       // driver.findElement(By.id("Password")).sendKeys("Pranal@10");
   driver.findElement(By.cssSelector("input[value='Log in']")).click();
//     
//       WebElement text = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
//             String text1 = text.getText();
//             System.out.println(text1);
//             text.isDisplayed();
           
            WebElement element = driver.findElement(By.cssSelector("span[for='Email']"));
           String text = element.getText();
           System.out.println(text);
             
	}

}
