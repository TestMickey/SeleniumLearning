package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	
		BrowserUtil test = new BrowserUtil();
		test.launchBrowserMethod("chrome");
		test.enterURl("http://www.amazon.com");
		String title = test.getPageTitle();
		System.out.println(title);
		if (title.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		String url = test.getAppCurrentUrl();
		System.out.println(title);
		
		
		By xpath = By.xpath("(//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']//tr)[last()]//td[last()]");
		
		System.out.println(xpath);
		
		Thread.sleep(5000);
		test.quitBrowser();
		
		
		
		
		
		
		
		
		
		

	}

}
