package SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	
	}

}
