package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Test Case
		//open browser(Chrome)
		//enter url
		//capture title-->Validation point actual vs expected for Pass/Fail
		//get the url
		//close the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\niyanta.pancholi\\OneDrive - Magenic\\Desktop\\Selenium Learning\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch browser
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
