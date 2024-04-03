package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.skillrary.com");
       // driver.findElement(By.linkText("SPANISH")).click();
      driver.findElement(By.linkText("ENGLISH")).click();
     driver.findElement(By.linkText("SIGN UP")).click();
     
     WebElement yesrdbtn = driver.findElement(By.id("usertype_yes"));
     
      if(yesrdbtn.isSelected()==false)
      {
    	  System.out.println("By default 'NO' is selected , changing it to 'YES'");
    	  yesrdbtn.click();
    	  System.out.println("group code selected = "+driver.findElement(By.id("groupcode")).isDisplayed());
    	 
      }
      else
      {
    	  System.out.println("By default 'YES' is selected");
    	  System.out.println("group code selected = "+driver.findElement(By.id("groupcode")).isDisplayed());
      }
      
	}

}
