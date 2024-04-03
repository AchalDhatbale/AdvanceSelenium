package RobotClassNotificationPopup;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeOptions Settings = new ChromeOptions();
      Settings.addArguments("--disable-notifications");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.easemytrip.com/");
      Thread.sleep(1000);
       
		

		
        
        

	}

}
