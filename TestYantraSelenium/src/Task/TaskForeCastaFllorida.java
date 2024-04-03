package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskForeCastaFllorida {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");
            WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	        driver.switchTo().frame(frame);
	        Actions act = new Actions(driver);
	        Thread.sleep(3000);
	        WebElement florida = driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='florida']"));
	        System.out.println(florida.getSize().getHeight());
	        System.out.println(florida.getSize().getWidth());
	        Thread.sleep(3000);
	        act.moveToElement(florida, 65, 20).click().perform();
	        WebElement rate = driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
	         String text = rate.getText();
	         System.out.println("FORECASTED INFECTION RATE FOR FLORIDA IS "+text);
	}

}
