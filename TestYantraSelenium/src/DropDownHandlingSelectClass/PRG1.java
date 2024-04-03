package DropDownHandlingSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRG1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
        Select ref1 = new Select(day);
        ref1.selectByValue("21");
         
        Select ref2 = new Select(month);
        ref2.selectByVisibleText("Mar");
        
        Select ref3 = new Select(year);
        ref3.selectByValue("2001");
        System.out.println(ref3.isMultiple());//false
        //ref3.deselectAll(); as this year dropdown is not multiselect so we can't use deselectAll()
        
        
        
	}

}
