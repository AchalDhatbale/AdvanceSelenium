package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
         
        WebElement usn = driver.findElement(By.id("email"));
	     Point location = usn.getLocation();
	     int x = location.getX();
	     Dimension size = usn.getSize();
	     int usnWidth = size.getWidth();
	     
	        WebElement pwd = driver.findElement(By.id("passContainer"));
		     Point l1 =pwd.getLocation();
		     int x1 = l1.getX();
		     Dimension size1 = usn.getSize();
		     int pwdWidth = size1.getWidth();
		     
		     
		     System.out.println(x);    System.out.println(x1);
		     if(x==x1)
		     {
		    	 System.out.println("Alligned from left  ");
		     }
		     else
		     {
		    	 System.out.println(" Not Alligned from left");
		     }
		     
		     if(x+usnWidth==x1+pwdWidth)
		     {
		    	 System.out.println("Alligned from right");
		     }
		     else
		     {
		    	 System.out.println(" Not Alligned from right");
		     }
		     
		     
	     
	}

}
