package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
	static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
		//driver.get("https://classic.crmpro.com/index.html");
		

		
		
		//1. ID- unique attribute/locator--I
		
		//2. name--II

//		driver.findElement(By.name("username")).sendKeys("test@email.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
//		
//		By emailId = By.name("usename");
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "test@email.com");
		
		//3. className--III
		//it's not unique.
		// we can have same class name for different names on the page.
		//driver.findElement(By.className("form-control")).sendKeys("testName");
		
		//4. XPath: It's not an attribute
		// address of an element inside HTML dom
		
		//*[@id="input-firstname"]-- relative XPath
		//html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input-- absolute XPath
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")).sendKeys("test@gmail.com");
		
		
//		By emailId = By.xpath("//*[@id=\\\"input-email\\\"]");
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
		
		//5. CSSSelector : It's not an attribute
		//we have to use attributes to create the CSSSelectors
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
		//6. LinkTest : only for links, but not an attribute.
		//text of the link.
		//html tag = a
//		By oHistoryLink = By.linkText("Order History");
//		doClick(oHistoryLink);
		
//		String orderHistory = "Order History";
//		eleUtil.doClick("linktext", orderHistory);
		
		//7. partialLinkText: only for links, but it's not an attribute
		//partial text of the link
		//html tag = a
		
//		driver.findElement(By.partialLinkText("List")).click();
		
		
		//8. tagName : html tag
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//			if(header.contains("Register Account")) {
//				System.out.println("Text is correct");
//			}
		By header = By.tagName("h1");
		
		if(doGetText(header).contains("Register Account")) {
		System.out.println("Text is correct");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	

}
