package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest{
	
	
	@Test
	public void contactUsTest() {
		boolean flag = driver.findElement(By.linkText("CONTACT SALES")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}
	
}