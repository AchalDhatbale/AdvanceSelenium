package SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\91860\\Downloads\\edgedriver_win64 (1)\\EdgeDriver.exe");
     EdgeDriver driver = new EdgeDriver();
    
	}

}
