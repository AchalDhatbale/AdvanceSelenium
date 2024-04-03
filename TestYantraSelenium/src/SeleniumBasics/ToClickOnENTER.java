package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnENTER {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://www.nykaafashion.com/");
        WebElement serchBox = driver.findElement(By.xpath("//input[@placeholder='Search for products, styles, brands']"));
      serchBox.sendKeys("lipstick",Keys.ENTER);
      System.out.println(serchBox.getAttribute("value"));
        
        
	}

}
