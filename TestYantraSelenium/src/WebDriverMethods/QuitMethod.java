package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.shoppersstack.com/products_page/8");
	     Thread.sleep(5000);
	     driver.findElement(By.id("compare")).click();
	     Thread.sleep(2000);
	     driver.quit();
	     
	     

	}

}
