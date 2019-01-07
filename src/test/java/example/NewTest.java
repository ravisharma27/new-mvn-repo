package example;		
	
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("https://www.google.com/");  
			String title = driver.getTitle();	
			System.out.println("New Title: " + title);
			//System.out.println("Sample Title");
			//Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("marionette", false);
			FirefoxOptions options = new FirefoxOptions();
		    options.merge(dc);
			driver = new FirefoxDriver(options);  
		}		
		@AfterTest
		public void afterTest() {
			System.out.println("Complete run");
			driver.quit();			
		}		
}	