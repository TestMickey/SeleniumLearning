package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		
		
		
		//Headless means no browser/hidden browser- no browser launch
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co= new ChromeOptions();
		
		//always write with -- and lowercase
		co.addArguments("--headless");
		
		
		//Incognito
		//co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
