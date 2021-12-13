package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcepts {
	
	/*
	 * 	Before Suite - DB Connection
		Before Test - Create User
		Before Class - Launch Browser
		
		Before Method - Login to App
		Test 2 = account Info Test
		After Method - logout
		
		Before Method - Login to App
		Test 1 = User Info Test
		After Method - logout
		
		After Class - Close Browser
		After Test - Delete User
		After Suite - Disconnect Database
	 */
	@BeforeSuite
	public void DBConnection() {
		System.out.println("Before Suite - DB Connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("Before Test - Create User");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class - Launch Browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Before Method - Login to App");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("Test 1 = User Info Test");
	}
	
	@Test
	public void accountInfoTest() {
		System.out.println("Test 2 = account Info Test");
		
	}
	
	@Test
	public void profileTest() {
		System.out.println("Test 3 = profile Test");
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method - logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class - Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test - Delete User");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("After Suite - Disconnect Database");
	}
}
