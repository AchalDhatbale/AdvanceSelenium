package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19Cricket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-col ds-grow ds-justify-center']/../..//span[text()='India']/../../../..//table[1]/tbody/tr/td[1]"));
	for(WebElement ele : elements)
	{
      //List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-col ds-grow ds-justify-center']/../..//span[text()='India']/../../../..//table[1]/tbody/tr["+i+"]/td[1]"));
      String name = ele.getText();
      System.out.println(name);
	}
	}//not completed 
	

}
//div[@class='ds-flex ds-flex-col ds-grow ds-justify-center']/../..//span[text()='India']/../../../..//table[1]/tbody/tr[1]/td[1]