package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	

public class AttributeConcepts {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		String hrefValue = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
//		System.out.println(hrefValue);
		
		By amazonDeviceLink = By.linkText("Amazon Devices");
		String hrefValue = getAttributeValue(amazonDeviceLink, "href");
		if(hrefValue.contains("footer_devices")) {
			System.out.println("this is correct href");
			
			driver.close();
		}
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getAttributeValue(By locator, String attriName) {
		String atrVal = getElement(locator).getAttribute(attriName);
		System.out.println(atrVal);
		return atrVal;
	}

}
