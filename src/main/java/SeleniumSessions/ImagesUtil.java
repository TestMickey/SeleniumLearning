package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtil {
	static WebDriver driver;
	
	//Interview Question
	//1. count all the images on the page
	//2. print src/alt attributes of each link on the console

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By images = By.tagName("img");
		By links = By.tagName("a");
		System.out.println(getLinksCount(images));
		List<String> atriList = getAttributeList(images, "src");
		printEleValue(atriList);
		
		printEleValue(getAttributeList(images, "alt"));
		
		printEleValue(getAttributeList(links, "href"));
		
		driver.close();
		

	}
	public static int getLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public static void printEleValue(List<String> eleList) {
		for (String e: eleList) {
			System.out.println(e);
		}
		
	}
	
	public static List<String> getAttributeList(By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		List<String> atriList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String atributeValue = e.getAttribute(attributeName);
			atriList.add(atributeValue);
		}
		return atriList;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

}
}
