package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
        driver.get("https://trello.com/login");
        driver.navigate().refresh();
        driver.findElement(By.id("user")).sendKeys("achald2001@gmail.com");
        driver.findElement(By.id("login")).click();
        driver.navigate().refresh();
	driver.findElement(By.id("password")).sendKeys("Pranjal@10");
        driver.findElement(By.id("login-submit")).click();
       // driver.navigate().refresh();
    	driver.findElement(By.xpath("//a[@class='board-tile']")).click();
    	
        WebElement from = driver.findElement(By.linkText("MT"));
        WebElement to = driver.findElement(By.xpath("//h2[text()='Done']"));
        
        Actions a = new Actions(driver);
        a.dragAndDrop(from, to).perform();
        
        
        
	}

}
