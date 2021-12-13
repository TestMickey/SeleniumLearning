package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {
	String browser = "firefox";
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else {
		System.out.println("please pass the correct browser..."+ browser);
	}
	
	driver.get("https://www.google.com");//launch url
	String title = driver.getTitle();//get title
	System.out.println("Page title is :" + title);
	
	//validation point(actual vs expected)
	if (title.equals("Google")) {
		System.out.println("Correct Title");
	}
	else {
		System.out.println("Incorrect Title");
	}
	
	//Automation Steps + Validation point = Automation Testing
	System.out.println(driver.getCurrentUrl());
	//driver.quit();//quit browser
	driver.close();
	
	}

}
