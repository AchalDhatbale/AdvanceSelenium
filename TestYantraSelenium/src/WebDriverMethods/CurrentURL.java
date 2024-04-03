package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.zeptonow.com");
	      String URL = driver.getCurrentUrl();
	      System.out.println(URL);

	}

}
