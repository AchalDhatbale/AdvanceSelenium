package WebDriverMethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     Thread.sleep(1000);
	     driver.get("https://parleproducts.com");
	     Thread.sleep(1000);
	     driver.get("https://www.oreo.com");
	     Thread.sleep(1000);
	     driver.get("https://www.meesho.com");
	     Thread.sleep(1000);
	     Navigation navigation = driver.navigate();
	     navigation.back();
	     Thread.sleep(1000);
	     navigation.back();
	     Thread.sleep(1000);
	     navigation.refresh();
	     
	     driver=new ChromeDriver();
	     driver.quit();
	}

}
