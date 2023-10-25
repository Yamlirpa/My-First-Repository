package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups_Learning_TC_005 {

	
	
	//Setting priorities
	
	@Test(groups= {"regression"})
	public void home_page_validation() {
		System.out.println("testing Home page");
	}
	
	@Test(groups= {"regression"})
	public void signin_page_validation() {
		System.out.println("testing Sign in page");
	}
	
	@Test(groups= {"smoke"})
	public void signup_page_validation() {
		System.out.println("testing sign up page");
	}
	
	@Test(groups= {"e2e"})
	public void cart_page_validation() {
		System.out.println("testing Cart page");
	}
}