package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_Suite {

	
	
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
