package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	

	@Test
	public void registerLinkTest() {
		boolean flag = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}
	
	

}