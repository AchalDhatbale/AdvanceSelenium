package DropDownHandlingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRG2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
        driver.get("https://demoapp.skillrary.com/");
         WebElement dropdown = driver.findElement(By.id("cars"));
         Select ref = new Select(dropdown);
         List<WebElement> eles = ref.getOptions();
         System.out.println("All options are ");
         for(WebElement oi : eles)
         {
        	 
        	 System.out.println(oi.getText());

         }
         ref.selectByValue("99");
         ref.selectByVisibleText("Free ( 90 ) ");
         ref.selectByIndex(2);
         System.out.println("");
         System.out.println("First selected element is ");
         System.out.println(ref.getFirstSelectedOption().getText());
         List<WebElement> ele = ref.getAllSelectedOptions();
         System.out.println("All Selected options are ");
         System.out.println("");
         for(WebElement o : ele)
         { 
        	 
        	 System.out.println(o.getText());
         }
         
         Thread.sleep(2000);
         ref.deselectAll();
       //  System.out.println(ref.getFirstSelectedOption());
         
         
        
	
	}

}
