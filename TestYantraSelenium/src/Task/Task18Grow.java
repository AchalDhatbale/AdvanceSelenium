package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task18Grow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
List<WebElement> Rows = driver.findElements(By.xpath("//h2[text()='22K & 24K Gold Rates Per Gram in  Bangalore']/../..//td[@class='tb10Td']/.."));
	System.out.println("Rows are "+Rows.size());
	
	
	for(WebElement s : Rows)
	{
	    WebElement rowdata = s.findElement(By.xpath("td[1]"));
	  
	    WebElement rowdata2 = s.findElement(By.xpath("td[2]/div/div[1]"));
	
	    System.out.println(rowdata.getText() +" -"+" "+rowdata2.getText());
	}

}
}