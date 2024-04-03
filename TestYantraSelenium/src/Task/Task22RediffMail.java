package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task22RediffMail 
{

	public static <T> void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
        driver.findElement(By.id("password")).sendKeys("Testing@123");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
  
        driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
        driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Achal");
       
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
        driver.switchTo().frame(frame);
        
        driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Selenium");
        driver.switchTo().parentFrame();
        
        driver.findElement(By.linkText("Send")).click();
        w1.until(ExpectedConditions.invisibilityOf(frame));
        
        File a = driver.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(a,new File("./Screenshot/RediffMailsend2.png"));
	    
	   driver.findElement(By.linkText("Inbox")).click();
	   driver.navigate().refresh();
	    driver.findElement(By.xpath("//li[@subject='Achal']")).click();
	    driver.findElement(By.linkText("Delete")).click();
	  //  Thread.sleep(1000);
	    
	  //WebElement msg = driver.findElement(By.xpath("//div1[text()='mail deleted successfully']"));//div1[text()='mail deleted successfully']
	    //w1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div1[text()='mail deleted successfully']"))));
	    
	    //FluentWait fw = new FluentWait(driver).pollingEvery(Duration.ofSeconds(3));
	    
	    File b = driver.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(b,new File("./Screenshot/RediffMaildlt2.png"));
	    
	    
        
        
        
        
        
        
        
	}

}
//Testing@123 Testing@123
//sumanthElfBatch@rediffmail.com
