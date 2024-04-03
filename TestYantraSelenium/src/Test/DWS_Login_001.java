package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_001 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Excpected result
		String WelComePageTitle = "Demo Web Shop";
		String LoginPageTitle = "Demo Web Shop. Login";
	    String HomePageURL = "https://demowebshop.tricentis.com/";
		
	     //To read data from Excel file 
		File abspath = new File("./Resources/DemoWebShopCredentials.xlsx");
		FileInputStream fis = new FileInputStream(abspath);
		Workbook workbook = WorkbookFactory.create(fis);
		String EmailEntered = workbook.getSheet("Sheet1").getRow(6).getCell(6).getStringCellValue();
		String PasswordEntered= workbook.getSheet("Sheet1").getRow(7).getCell(6).getStringCellValue();
		
		//Step 1 = Launch the Browser and enter the URL 
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://demowebshop.tricentis.com/");
         String WelcomePageTtitle = driver.getTitle();
        
         String ActualWelComePageTtitle = driver.getTitle();
         if(ActualWelComePageTtitle.equals(WelComePageTitle))
         {
        	 System.out.println("Welcome page is displayed");
         }
         else
         {
        	 System.out.println("Welcome page is not displayed");
         }
         
        // Step 2 = Click on login link 
         driver.findElement(By.linkText("Log in")).click();
        if(driver.getTitle().endsWith(LoginPageTitle))
        	{
        	   System.out.println("Login page displayed");
        	}
        else
        {
        	System.out.println("Login page is not displayed");
        }
         
        //Step 3 = Entered valid Email id And Password 
       WebElement EmailTB = driver.findElement(By.id("Email"));
       EmailTB.clear();
        EmailTB.sendKeys(EmailEntered);
        String EmailVisible = EmailTB.getAttribute("value");
        if(EmailEntered.equals(EmailVisible))
        {
        	System.out.println("Correct Email id Entered");
        }
        else
        {
        	System.out.println("Correct Email id is not Entered");
        }
        
        
      WebElement PasswordTB = driver.findElement(By.id("Password"));
       PasswordTB.clear();
       PasswordTB.sendKeys(PasswordEntered);
       String PasswordVisible = PasswordTB.getAttribute("value");
       if(PasswordEntered.equals(PasswordVisible))
       {
       	System.out.println("Correct Password Entered");
       }
       else
       {
       	System.out.println("Correct password is not Entered");
       }
       
       //Step 4 = click on login button 
       driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
       System.out.println("Clicked on login button ");
      String displayedHomePageURL = driver.getCurrentUrl();
         if(HomePageURL.equals(displayedHomePageURL))
         {
        	 System.out.println("Home Page is display");
         }
         else
         {
        	 System.out.println("Home Page is not display");

         }
         
         
     

     
        
        
        
        
        
        
        
        
        
        
	}

}
