package blueocean.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class TestSample {

WebDriver driver;

@Test
public void blueOceanGit(){
	
	System.setProperty("webdriver.ie.driver", "C:\Users\dev23kmr\.jenkins\workspace\blueOcean\src\test\resources\IEDriver");
	driver = new InternetExplorerDriver();
	driver.get("https://www.google.com");
	
}
}
