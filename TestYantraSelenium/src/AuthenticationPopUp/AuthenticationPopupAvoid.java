package AuthenticationPopUp;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupAvoid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
