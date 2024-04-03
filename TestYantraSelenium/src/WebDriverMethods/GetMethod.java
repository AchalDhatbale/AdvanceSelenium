package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.meesho.com");
		
	}

}
