package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.gecko.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverCastings {

	public static void main(String[] args) {
	
		//1. WebDriver - Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		
		//2. ChromeDriver - ChromeDriver
		WebDriver driver1 = new ChromeDriver();
		
		
		//3. Remote Web Driver - ChromeDriver
		RemoteWebDriver driver2 = new ChromeDriver();
		//driver2.
		//driver = new FirefoxDriver();
		
		//4. WebDriver - RemoteWebDriver
		Capabilities capabilities = null;
		//WebDriver driver3 = new RemoteWebDriver(new URL ("192.45.1.10.4444"), capabilities) ;
		
		//5. Search Context - ChromeDriver
		SearchContext driver4 = new ChromeDriver();
		
		
		//6. Search Context- RemoteWebDriver
		//SearchContext driver5 = new RemoteWebDriver(new URL ("192.45.1.10.4444"), capabilities);
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
