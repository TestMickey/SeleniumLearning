package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextUtil {


		static WebDriver driver;

		public static void main(String[] args) {
				
			
			//1. get the count of the links/images on the page
			//2. return a list<string> - this will hold the text of each link
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			//
			//List<WebElement> links = driver.findElements(By.tagName("a"));
			By images = By.tagName("a");
			System.out.println(getLinksCount(images));
			
			//2. Answer
			
			List<String> activeList = getElementsTextList(images);
			for(String e : activeList) {
				System.out.println(e);
			}
			
			// using method to print 
			
			if(getElementsTextList(images).contains("Amazon")) {
				System.out.println("--------------------------------------------All Links with Amazon");
			}
			driver.close();
			
		}
			
	
		
		
		public static List<String> getElementsTextList(By locator) {
			List<WebElement> eleList = getElements(locator);
			List<String> eleTextList = new ArrayList<String>();
			for (WebElement e: eleList) {
				String text = e.getText();
				if(!e.getText().isEmpty()){
					eleTextList.add(text);
				}
			}
			return eleTextList;
		}
		
		public static int getLinksCount(By locator) {
			return getElements(locator).size();
		}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);

}
}
