package Task;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a file name with extension");
//		String s = sc.next();
//		File f = new File(s);
//		
//		if(!f.exists())
//		{
//			f.createNewFile();
//			System.out.println("File created");
//		}
//		else
//		{
//			System.out.println("File is alraedy exixt");
//		}
//		
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.bluestone.com");
	     String Title = driver.getTitle();
	     String URL = driver.getCurrentUrl();
	     FileOutputStream fos = new FileOutputStream("./Drivers/NewFile");
	     System.out.println(Title);
	     System.out.println(URL);
	     fos.write(Title.getBytes());
	     fos.write(URL.getBytes());
	    
	     
	     
	     
	     
	     
	     
	     
	     

	}

}
