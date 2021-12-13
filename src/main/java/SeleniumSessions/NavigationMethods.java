package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		
		//navigate and get are the same methods
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// get brings page
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		// navigate also brings the page
		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());
		// go back to earlier page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		//go forward to the next page
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		// go back to earlier page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
