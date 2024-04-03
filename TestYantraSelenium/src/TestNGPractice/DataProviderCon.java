package TestNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCon {
	
	@DataProvider
	public String [][]sendData() throws EncryptedDocumentException, IOException{
		 File fis = new File("./Resources/RegistrationData.xlsx");
	        FileInputStream fis2 = new FileInputStream(fis);
	       Workbook workbook = WorkbookFactory.create(fis2);
			int rowCount =  workbook.getSheet("Sheet1").getPhysicalNumberOfRows()-1;

	       int cellCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
          String data[][]=new String[rowCount+1][cellCount+1];
			for(int i=0;i<=rowCount;i++)
           {
        	   for(int j=0;j<=cellCount;j++)
        	   {
        	     data[i][j] = workbook.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
     	       }
            }
	        return data ;
	   }
	

	 @Test(dataProvider = "sendData")
	public void registration(String[]credentials)
	{
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.id("gender-"+credentials[5])).click();
	  driver.findElement(By.id("FirstName")).sendKeys(credentials[0]);
	  driver.findElement(By.id("LastName")).sendKeys(credentials[1]);
	  driver.findElement(By.id("Email")).sendKeys(credentials[2]);
	  driver.findElement(By.id("Password")).sendKeys(credentials[3]);
	  driver.findElement(By.id("ConfirmPassword")).sendKeys(credentials[4]);
	  driver.findElement(By.id("register-button")).click();
   }
}
