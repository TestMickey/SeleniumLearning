package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Interview Question
				//1. count all the images on the page
				//2. print src/alt attributes of each link on the console
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//1. Answer

		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());
		
		//2. Answer
		for(WebElement e : imageList) {
			String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");
			System.out.println(altValue+"--->"+srcValue);
		}
		
		
		
		
		
		
		
		driver.quit();
	}

}
