package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import common.Reusable;
import pageObject.Stackoverflow_page;


public class StackoverflowTest {
	private WebDriver driver=null;
	private Reusable reu;
	private WebElement alert;
	;


	@BeforeClass
	public void setUp(){
		reu=new Reusable();

		driver = reu.createDriverInstance();
		driver.get(reu.getGlobalData("stackoverflow_url"));
	}
	@Test(priority=1)
	public void test_theLogo(){

		Assert.assertTrue(driver.findElement(By.xpath("(//span[text()='Stack Overflow'])[1]")).isDisplayed());
	}
	@Test(priority=2)
	public void test_the_Aboutheader_link(){
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='About'])[1]")).isDisplayed());
	}
	@Test(priority=3)
	public void test_the_Products_link(){
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='Products'])")).isDisplayed());
	}
	@Test(priority=4)
	public void test_For_Teams_link(){
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='For Teams'])[1]")).isDisplayed());
	}
	@Test(priority=5)
	public void Search_box(){
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());
	//	alert.sendKeys("Search Text");
	}
	@Test(priority=6)
	public void test_the_Log_in_button(){
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log in'][1]")).isDisplayed());
		
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
