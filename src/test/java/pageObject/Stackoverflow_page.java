package pageObject;
import org.openqa.selenium.By;


public class Stackoverflow_page {


public By Stackoverflow_page_logo(){return By.xpath("//span[text()='Stack Overflow'])[1]");}
public By Aboutheader_link(){return By.xpath("(//a[text()='About'])[1]");}
public By Products_link(){return By.xpath("//a[text()='Products'])");}
public By For_Teams_link(){return By.xpath("//a[text()='For Teams'])[1]");}
public By Search_Box(){return By.xpath("//input[@name='q']");}
public By Log_in_button(){return By.xpath("//a[text()='Log in'][1]))");}












}
