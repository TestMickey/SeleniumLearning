package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");
		
		By username = By.name("username");
		By password = By.name("password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		userName_ele.sendKeys("naveen");
		//TimeoutException: Expected condition failed: waiting for presence of element located by: By.name: username11 
		//(tried for 10 second(s) with 500 milliseconds interval)
		
		
		doSendKeys(username, "naveen", 10);
		//doPresenceOfElementLocated(username, 10).sendKeys("naveen");
		driver.findElement(password).sendKeys("test123");
		driver.findElement(loginBtn).click();

	}
	public static void doSendKeys(By locator, String value, int timeout) {
		doPresenceOfElementLocated(locator, timeout).sendKeys(value);
	}
	
	public static WebElement doPresenceOfElementLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
		
	}
	
	public static WebElement doPresenceOfElementLocated(By locator, int timeout, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
		
	}

}
