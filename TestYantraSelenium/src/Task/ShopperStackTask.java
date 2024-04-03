package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackTask {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        driver.get("https://www.shoppersstack.com/user-signin");
	        
	        driver.findElement(By.id("Email")).sendKeys("achald2001@gmail.com");
	        driver.findElement(By.id("Password")).sendKeys("Pranjal@10");
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        
	        WebElement favIcon = driver.findElement(By.xpath("//span[text()='SANTOOR']/../..//*[name()='svg']"));
	         String BeforeColor = favIcon.getCssValue("fill");
	        favIcon.click(); 
	        Thread.sleep(4000);
	         String Aftercolor = favIcon.getCssValue("fill");
	         System.out.println("before color is : "+ BeforeColor +"  "+ "After color is : "+Aftercolor);

	}

}
