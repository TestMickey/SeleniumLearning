package MyTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@BeforeTest
	public void launchBrowser() {
		System.out.println("browser launch");
	}
	
	@Test
	public void createUserTest() {
		System.out.println("Create User Test");
	}
	
	
	// depends on 1st or any test case and then to decide if others should run or not. 
	
	
	
	//Login test becomes Super test 
	@Test
	public void loginTest() {
		System.out.println("Login to App");
		//int i = 9/0;// this will make other test cases ignored
	}
	@Test(dependsOnMethods = {"loginTest", "createUserTest"}, priority = 1)
	public void homePageTest() {
		System.out.println("home page test");
	}
	@Test(dependsOnMethods = {"loginTest", "createUserTest"}, priority =3)
	public void searchTest() {
		System.out.println("Search test");
	}
	
	
	//unit test
	// test case should be independant
	// never create any dependancy
	// every test should have its own pre condition, test steps, assertion and status
	
}
