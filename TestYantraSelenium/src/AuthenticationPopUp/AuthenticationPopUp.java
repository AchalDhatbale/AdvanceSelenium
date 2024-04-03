package AuthenticationPopUp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_A);
         robot.keyRelease(KeyEvent.VK_L);
         
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_M);
        
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_N);
       
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);






        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
