package MethodsOfWebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueShoppesstack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://in.urbanic.com/details/geometric-artificial-jewellery-pendant-necklace-111212?vid=15");
        
        

	}

}
