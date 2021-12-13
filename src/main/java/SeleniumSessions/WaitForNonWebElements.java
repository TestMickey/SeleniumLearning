package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElements {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Contact us")).click();
		if(waitForURLToBe("controller=contact", 5)) {
			System.out.println("Fraction of URL is correct");
		};
		if(waitForURL("http://automationpractice.com/index.php", 5)) {
			System.out.println("Complete URL is correct");
		}
		
		waitForTitleFraction("Store", 5);
		String title= doGetTitle("Contact us", 5);
		System.out.println(title);
		
		driver.close();
	
		
		
		
	

	}
	//Verify fraction of URL
	public static boolean waitForURLToBe(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(urlFraction));
		
	}
	//Verify complete URL
	public static boolean waitForURL(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(url));
		
	}
	
	//Verify fraction title of the page
	public static boolean waitForTitleFraction(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(titleFraction));
		
	}
	
	// Verify complete title
	public static String doGetTitle(String title, int timeOut) {
		if (waitForTitleToBe(title, timeOut)) {
			return driver.getTitle();
		}
		return null;
	}
	
	
	public static boolean waitForTitleToBe(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleIs(title));
	}
	
	

}
