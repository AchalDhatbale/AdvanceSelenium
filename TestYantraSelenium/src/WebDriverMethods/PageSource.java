package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.bluestone.com");
	     String PageSource =  driver.getPageSource();
	     System.out.println(PageSource);

	}

}
