package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForeCasts {

	public static void main(String[] args) {
	
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");
	        WebElement state=driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	        driver.switchTo().frame(state);
	        driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g' and @id='nebraska']")).click();

	        WebElement per=driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
	        System.out.println("FORECASTED INFECTION RATE IS "+per.getText()+"%");

	        driver.findElement(By.linkText("UNITED STATES")).click();

	        driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g' and @id='florida']")).click();
	        WebElement per1=driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
	        System.out.println("FORECASTED INFECTION RATE IS "+per1.getText()+"%");

	        //place("nebraska");
	        }

	        // public static void place(String name)
	        // {
	        //
	        // driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g' and @id='']"+name)).click();
	        //
	        // WebElement per=driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
	        // System.out.println("FORECASTED INFECTION RATE IS "+per.getText()+"%");

	        
	        

	}


