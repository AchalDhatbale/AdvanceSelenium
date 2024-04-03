package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("file:///C:/Users/91860/Downloads/MultipleWindow.html");
         driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
         
         
	}

}
