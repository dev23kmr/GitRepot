package blueocean.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class TestSample {

WebDriver driver;

@Test
public void blueOceanGit(){
	
	System.setProperty("webdriver.ie.driver", "src\test\resources\IEDriver\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.get("https://www.google.com");
	
}
}
