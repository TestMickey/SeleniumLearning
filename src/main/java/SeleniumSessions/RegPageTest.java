package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowserMethod("chrome");
		
		brUtil.enterURl("https://demo.opencart.com/index.php?route=account/register");
		
		//get title of the page
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//get first name
		By firstName  = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By passWord = By.id("input-password");
		By passWordConfirm = By.id("input-confirm");
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "test1");
		eleUtil.doSendKeys(lastName, "last1");
		eleUtil.doSendKeys(email, "email@gmail.com");
		eleUtil.doSendKeys(phone, "555");
		eleUtil.doSendKeys(passWord, "this is password");
		eleUtil.doSendKeys(passWordConfirm, "this is password");
		
		
		Thread.sleep(5000);

		brUtil.closeBrowser();
		}

}
