package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	/**
	 * This method will be used to launch browser on the basis of given browser name
	 * @param browser
	 * @return driver
	 */
	public WebDriver launchBrowserMethod(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			//Below line will be useful when versions gets updated. 
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("please pass the correct browser..."+ browser);
		}
		return driver;
	}
	
	/**
	 * This method is used to enter the url.
	 * @param url
	 */
	public void enterURl(String url) {
		if (url==null) {
			System.out.println("URL is null");
			return;
		}
		
		if (url.indexOf("http")==-1) {
			System.out.println("http is missing in the url");
			return;
		}
		
		driver.get(url);
		
		
		}
		
	/**
	 * 
	 * @return will return current page url
	 */
		public String getAppCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	

}
