package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathPractice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		
//		Thread.sleep(5000);
//		
//		List <WebElement> optionList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
//		System.out.println((optionList).size());
//		
//		for (WebElement e: optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if (text =="My Account") {
////				e.click();
//				
//			}
////			else {
////				System.out.println("Option is not available for clicking.");
////			}
//			
//}
		WebElement parentMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][text()='MP3 Players']"));
		parentMenu.click();
		
		By mp3Menu = By.linkText("MP3 Players");
		By childMenus = By.linkText("Show All MP3 Players");
		doClickOnChildMenu(mp3Menu, childMenus);
		
//		for() {
//			
//		}
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
		
		
		driver.findElement(By.linkText("Show All MP3 Players")).click();
	}
	
	public static void doClickOnChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		doMoveToElement(parentMenuLocator);
		Thread.sleep(3000);
		getElement(childMenuLocator).click();
	}
	

}
