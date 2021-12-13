package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create the webelement + actions(click, sendkeys, gettext, isdisplayed, isenabled.
		
		//1. First approach
		/*driver.findElement(By.id("input-email")).sendKeys("123@mail.com");
		driver.findElement(By.id("input-password")).sendKeys("password");
		
		//2. 2nd approach
		WebElement emailID = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailID.sendKeys("123@mail.com");
		password.sendKeys("password");
		
		//3. approach by locator
		By username = By.id("input-email");
		By passWord = By.id("password");
		
		WebElement uID = driver.findElement(username);
		WebElement pwd = driver.findElement(passWord);
		
		uID.sendKeys("123@mail.com");
		pwd.sendKeys("password");*/
		
		//4. by locator with generic method
//		
//		By userName = By.id("");
//		By passW = By.id("");
//		
//		getElement(userName).sendKeys("123@mail.com");
//		getElement(passW).sendKeys("password");
		
		//5. By Locator with generic method (getElement() with action methods)
		
//		By userName = By.id("input-email");
//		By passW = By.id("input-password");
//		
//		doSendKeys(userName, "test@gmail.com");
//		doSendKeys(passW, "test 123");
		
		//6. ElementUtil class with generic methods
		
		By userName = By.id("input-email");
		By passW = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(userName, "test@gmail.com");
		eleUtil.doSendKeys(passW, "test 123");
		
		//7. String locator values
		String un = "input-email";
		String pw = "input-password";
		
		
		
		doSendKeys("id", un, "test@gmail.com");
		doSendKeys("id", pw, "test 123");
		
		driver.quit();		
	}
	
		public static By getBy(String locatorType, String locatorValue) {
			By locator = null;
			switch (locatorType.toLowerCase()) {
			case "id":
				locator = By.id(locatorValue);
				break;
				
			default:
				System.out.println("please pass correct locator");
				break;
			}
			return locator;
		}
		
	private WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	private static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	

}
