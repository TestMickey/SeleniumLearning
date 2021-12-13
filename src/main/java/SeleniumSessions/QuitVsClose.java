package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();//launch browser
		driver.get("https://www.google.com");//launch url
		String title = driver.getTitle();//get title
		System.out.println("Page title is :" + title);
		driver.close();
		
		System.out.println(driver.getTitle());
		
		driver.quit();//close all browsers

	}

}
