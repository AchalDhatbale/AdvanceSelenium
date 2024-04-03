package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {//close all child browser

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("file:///C:/Users/91860/Downloads/MultipleWindow.html");
        driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
          Thread.sleep(1000);
         
          Set<String> AllIds = driver.getWindowHandles();
          for(String id :AllIds )
          {
        	  driver.switchTo().window(id);
        	  System.out.println(driver.getTitle());
        	  if(!driver.getTitle().contains("Multiple popup"))
        	  {
        		  driver.close();
        		 
        	  }
          }
         

	}

}
