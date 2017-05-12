package testnG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTest {

	@BeforeSuite
		public void initializeSelenium(){
		System.out.println("before suite");	
		//selenium object - webdriver
		//before amd after suite annotations ca only be used once among all the .java files having test cases
		//so it executes before executing all the test cases in all the .java files
		//so aftersuite is called after executing all the test cases in all the java files
		}
	
	@AfterSuite
	public void shutdownSelenium(){
	System.out.println("after suite");
	// destroy selenium webdriver object
	}

	@BeforeTest
	public void beforeTest() {
		  System.out.println("In before test ");
		  //connection with database
		  //verify if internet is working by opening --> navigate to test site and --> close it
		  //or just launch the browser
		 //before executing all the test cases
		  
	  } 
	@AfterTest
	public void afterTest() {
		  System.out.println("In after test ");
		  //after executing all the test cases
	}
	
	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("In before method");
		  //before executing each and every test case
		  //say start browser
	  }
	
	@AfterMethod
	  public void afterMethod() {
		  System.out.println("In after method");
		  //after executing each and every test case
	  }
	 @Test
	  public void tesReceiveMail() {
		  System.out.println("Test reveiving mail");
	  }
 
	 @Test
	  public void testSendingMail() {
		  System.out.println("Test sending mail");
	  }
	 
  
  

 

}
