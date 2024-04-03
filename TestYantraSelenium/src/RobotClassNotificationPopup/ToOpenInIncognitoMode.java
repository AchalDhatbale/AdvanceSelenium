package RobotClassNotificationPopup;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToOpenInIncognitoMode {

	public static void main(String[] args) {

		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
		  ChromeOptions Settings = new ChromeOptions();
//		  ArrayList al= new ArrayList();
//		  al.add("--incognit");
//		  al.add("--disable-notifications");
//		  
		   Settings.addArguments("--incognit")	;	 
		 // Settings.addArguments("//--incognit"); 
		  ChromeDriver driver = new ChromeDriver(Settings); 
		  driver.manage().window().maximize();
		   driver.get("https://www.easemytrip.com/"); 
		  
		   
		 
		         

	}

}
