package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.skillrary.com/user/login");
        driver.findElement(By.name("email")).sendKeys("achald2001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Pranjal@10");
        Thread.sleep(2000);
        driver.findElement(By.name("captcha")).sendKeys("asdfgh");
      //a[@class='dropdown-toggle ignorelink']
        driver.findElement(By.xpath("//a[@class='dropdown-toggle ignorelink']")).click();
	}

}
