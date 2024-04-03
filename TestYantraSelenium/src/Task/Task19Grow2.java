package Task;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task19Grow2 {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");

	 List<WebElement> rows = driver.findElements(By.xpath("//h2[text()='Historical Gold Rates in Bangalore for the Last 10 Days']/../..//td[@class='tb10Td']/.."));
	 System.out.println("Rows are "+rows.size());
	 for(WebElement row : rows)
	 {
		 WebElement rowdata = row.findElement(By.xpath("td[1]"));
		  
		    WebElement rowdata2 = row.findElement(By.xpath("td[2]/div[1]"));
		
		    System.out.println(rowdata.getText() +" -"+" "+rowdata2.getText());
	 }

}
}