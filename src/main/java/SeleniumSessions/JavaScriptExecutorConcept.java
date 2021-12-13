package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		JavaScriptExecutorConcept js = (JavaScriptExecutorConcept) driver;
//		js.executeScript("alert('hi')");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
//
//		// get whole text of the page
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//		
//		jsUtil.refreshBrowserByJS();
//		
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
//		jsUtil.drawBorder(login);
		//WebElement loginForm = driver.findElement(By.id("loginForm"));
//		jsUtil.drawBorder(loginForm);
		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		jsUtil.flash(emailId);
//		emailId.sendKeys("naveen@gmail.com");
//		jsUtil.flash(password);
//		password.sendKeys("test123");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		jsUtil.clickElementByJS(register);
		
		
		//Web Element--click
		//Actions - click
		//Actions - MoveElement--Click
		//JS -- click
		//Exp Wait--WE--click
		
		
		//scroll page down
		jsUtil.scrollPageDown();
		Thread.sleep(3000);
		
		//Scroll page up
		jsUtil.scrollPageUp();
		Thread.sleep(3000);
		
		// scroll till reach the element
//		jsUtil.scrollPageDown("500");
//		WebElement heading = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
//		jsUtil.scrollIntoView(heading);
//		System.out.println(heading.getText());
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("naveen@gmail.com");
		//System.out.println(emailId.getText());
		String val = emailId.getAttribute("value");
		System.out.println(val);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



}
