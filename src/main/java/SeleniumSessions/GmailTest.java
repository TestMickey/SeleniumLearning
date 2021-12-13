package SeleniumSessions;

public class GmailTest {

	public static void main(String[] args) {
		BrowserUtil test = new BrowserUtil();
		test.launchBrowserMethod("firefox");
		test.enterURl("https://www.outlook.com");
		String title = test.getPageTitle();
		System.out.println(title);
		if (title.contains("Outlook")) {
			System.out.println("Title is correct");
		}
		String url = test.getAppCurrentUrl();
		System.out.println(title);
		test.quitBrowser();
		

	}

}
