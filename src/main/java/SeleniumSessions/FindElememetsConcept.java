package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElememetsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
			
		//Interview Question
		//1. count all the links and images of the page
		//2. print the text of the each link on the console
		//3. remove or avaoid blank texts
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//1. Answer
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		By images = By.tagName("a");
		List<WebElement> links= getElements(images);
		System.out.println("Total links "+ links.size());
		//2. Answer
		for (int i = 0; i<links.size(); i++) {
			String text = links.get(i).getText();
		//3. Answer
//			if(!text.isEmpty()) {
//			System.out.println(text);
//			}
//		
		}
		
		//for each- Answer -3
		for(WebElement e : links) {
			String text = e.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
			}
		}
		driver.quit();
		
		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}

}
