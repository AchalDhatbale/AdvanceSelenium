package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfWebPage {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.swiggy.com");
	    String Title =  driver.getTitle();
	    System.out.println(Title);
		
		
	}

}
