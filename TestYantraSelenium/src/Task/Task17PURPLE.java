package Task;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Task17PURPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.purplle.com/");
        Thread.sleep(1000);
//         WebElement ShopCT = driver.findElement(By.linkText("SHOP CATEGORIES"));
//       
//     driver.findElement(By.linkText("Makeup")).click();
//       driver.findElement(By.linkText("Primer")).click();
//       driver.findElement(By.id("354209")).click();
     
//       
//       ShopCT.click();
//       driver.findElement(By.partialLinkText("Hair Care")).click();
//         driver.findElement(By.partialLinkText("Shampoo")).click();
//         driver.findElement(By.id("185345")).click();
//     
//         ShopCT.click();
//         driver.findElement(By.partialLinkText(" Fragrance")).click();
//           driver.findElement(By.partialLinkText("Perfumes")).click();
//           driver.findElement(By.id("349637")).click();

        driver.findElement(By.linkText("NEW")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[.=' Good Vibes Aloe Vera & Shea Butter Hydrating Sunscreen Lotion SPF 50, Skin Moisturizing | Vegan, No Parabens, No Mineral Oil, No Silicones (110 ml) ']")).click();
        //not completed
        

	}

}
