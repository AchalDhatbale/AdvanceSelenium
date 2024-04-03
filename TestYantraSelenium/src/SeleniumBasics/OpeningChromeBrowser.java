package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChromeBrowser {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     
	}

}
