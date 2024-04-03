package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task11111 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.google.co.in/");
        driver.findElement(By.id("APjFqb")).sendKeys("https://www.cleartrip.com/",Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='Cleartrip']")).click();
       
        //Creating FIS 
        File fis = new File("./Resources/FromTotoCity.xlsx");
        FileInputStream fis2 = new FileInputStream(fis);
       Workbook workbook = WorkbookFactory.create(fis2);
       String FromCityData = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
       String ToCityData = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

       driver.findElement(By.xpath("//div[contains(@class,'px-1   flex flex-middle nmx-1 pb-1')]")).click();
       
    WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
     fromCity.sendKeys(FromCityData);
     
     driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();

   WebElement ToCity = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
     ToCity.sendKeys(ToCityData);
     
     driver.findElement(By.xpath("//p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']")).click();

    // driver.findElement(By.partialLinkText("Search flights")).click();
     
     driver.findElement(By.xpath("//button[contains(@class,'flex flex-middle  t-a'][1]")).click();
     
     
     
     
     
        
	}

}
