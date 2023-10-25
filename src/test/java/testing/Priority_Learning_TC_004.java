package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_Learning_TC_004 {

	@BeforeClass
	public void lauanch_application() {

		System.out.println("lauanch the application");

	}

	//Setting priorities

	@Test(priority=2)
	public void home_page_validation() {
		System.out.println("testing Home page");
	}

	@Test(priority=1)
	public void signin_page_validation() {
		System.out.println("testing Sign in page");
	}

	@Test(priority=0)
	public void signup_page_validation() {
		System.out.println("testing sign up page");
	}

	@Test(priority=3)
	public void cart_page_validation() {
		System.out.println("testing Cart page");
	}

	@AfterClass
	public void close_application()
	{
		System.out.println("Closing the Application");
	}




}
