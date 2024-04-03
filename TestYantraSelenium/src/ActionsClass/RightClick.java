package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

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
	//driver.findElement(By.xpath("//a[@class='oTmCsFlPhDLGz2 AQ0dAIzWIJDFUU undefined RPa_ezCLkUNX1W RdqZOPHqhCnasP']")).click();
	driver.findElement(By.xpath("//a[@class='board-tile']")).click();
	WebElement ele = driver.findElement(By.xpath("//a[@class='NdQKKfeqJDDdX3']"));
	
	Actions a = new Actions(driver);
	a.contextClick(ele).perform();
	
	WebElement element = driver.findElement(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
	System.out.println(element.getText());
	
	//Another way
	
	//WebElement Fele = driver.findElement(By.xpath("//a[@class='BppQGb2j7TfyB5']"));
	//System.out.println(Fele.getText());
	
//	List<WebElement> eles = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
//	for(WebElement o : eles)
//	{
//		System.out.println(o.getText());
//	}
	        
	}

}
