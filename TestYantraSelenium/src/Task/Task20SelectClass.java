package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task20SelectClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
        Task20SelectClass t1 = new Task20SelectClass();
        t1.dropdown(day);
        t1.dropdown(month);
        t1.dropdown(year);
	}
        
        
     public void dropdown(WebElement d)
	{
    	Select s = new Select(d);
        List<WebElement> ele = s.getOptions();
        int size = ele.size();
       s.selectByIndex(size-1);
     }

	 
}
