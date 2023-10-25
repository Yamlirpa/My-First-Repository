package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_002 {

	WebDriver driver;

	@BeforeClass
	public void launch_application() {
		System.out.println("I am launching Google Chrome browser");

		driver=new ChromeDriver();	//this line is creating ChromeDriver instance and storing it into driver variable

		//Give URL into the browser

		driver.get("https://www.vinsys.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
	}

	@AfterClass 
	public void close_application(){
		System.out.println("I am closing Google Chrome");
		driver.quit();
	}



	@Test
	public void do_some_testing() {
		//System.out.println("My first TestNG test script");

		//if(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed()) {

		//System.out.println("Google logo is present");


		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='logo']//img")).isDisplayed(), "Google logo is present");
	}

	@Test
	public void do_some_testing_1() {
		System.out.println("My 2nd TestNG test script");

	}


}
