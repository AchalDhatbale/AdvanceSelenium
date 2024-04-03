package WebDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("webdriver/chrome/driver","./driver/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://www.meesho.com");
	       Thread.sleep(2000);
	       driver.manage().window().minimize();
	       Thread.sleep(2000);
	       driver.manage().window().fullscreen();
	       
	       //To get size of browser
	       Dimension size = driver.manage().window().getSize();
	       int height = size.getHeight();
	       int width = size.getWidth();
	       System.out.println("Height is "+height +" , Width is "+width);
	       
	       //to set size of browser
	       Thread.sleep(2000);
	     Dimension  newsize = new Dimension(500,500);
	       driver.manage().window().setSize(newsize);
	       
	       //to get position
	       Point point = driver.manage().window().getPosition();
	       int X =point.getX() ;
	       int Y = point.getY();
	      System.out.println("X co-ordinate is "+X);
	      System.out.println("X co-ordinate is "+Y);
	      
	       //to set position 
	      Thread.sleep(2000);
	       Point target = new Point(100,200);
	       driver.manage().window().setPosition(target);
	       driver.close();
	       
	       
	       
	       
	       
	       
	}
	

}
