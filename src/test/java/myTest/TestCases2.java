package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases2 {

	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1()
	{
		System.out.println("Open Browser");		
		Assert.assertEquals(true, true,"Browser is not Opened");     // Hard assertion, means after this line code failure then next steps will not be executed and test case will be marked as Fail
		
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		
		System.out.println("Click on sign in button");		
		Assert.assertEquals(true, true, "Not able to Sign In");   // This is also Hard assertion
		
		System.out.println("Validate Homepage");	
		softAssert.assertEquals(true, true, "Home page title is not visible");   // This is Soft assertion, means even though this step failed next steps will be executed 
		
		System.out.println("Go to deals page");
		System.out.println("Create a deal");
		softAssert.assertEquals(true, true, "Deal is not Created"); 
		
		System.out.println("Go to contacts page");
		System.out.println("Create a contact");
		softAssert.assertEquals(true, true, "Contact is not created"); 
		
		softAssert.assertAll();       // This step will do final round of assertion on all the soft asserts and if there are any failure then it will mark test case as "Fail"
		
		
	}
	
	
}
