package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.aqi.in/dashboard/canada");
		//select main element
		WebElement ele = driver.findElement(By.linkText("Abbotsford, Canada"));
		System.out.println(ele);
		// go right or left of that element
		String aqNum = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqNum);
		
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		
		System.out.println(rank);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String name = driver.findElement(with(By.tagName("p")).near(ele)).getText();//within 15 px distance
		System.out.println(name);

	}

}
