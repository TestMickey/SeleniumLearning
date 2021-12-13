package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// search tab
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		Thread.sleep(5000);
		//verify list
		
		selectOptionFromSuggList("Evening Dresses > Printed");
//		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Evening Dresses > Printed')]")).click();
//		List <WebElement> searchDress = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
//		System.out.println(searchDress.size());
//		//click on list
//		for(WebElement e: searchDress) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("casual Dresses")) {
//				e.click();
//				break;
//			}
//		}
		
		Thread.sleep(5000);
		
		driver.close();

	}
	//method to click and open page
	public static void selectOptionFromSuggList(String value) {
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+value+"')]")).click();
		
		
	}

}
