package CrossBrowserExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	@Parameters("BName")

	@Test
	public void method2(@Optional("Chrome") String BrowserName) {
		WebDriver driver = null;
		if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			;
			driver = new ChromeDriver();

		} else if (BrowserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			
			driver = new EdgeDriver();

		} else {
			Reporter.log("Invalid browser name ", true);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.pepsodent.in/");

	}

}
