package Gluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Skillspage;
import io.cucumber.java.en.*;

public class steps1 {

	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait 
	}
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TestURL) {
		driver.get(TestURL);
	}
	
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
		Loginpage L1=new Loginpage();
		L1.passdriver(driver);
		L1.login(username, password);
	}
	@Then("Creating Skills Record1")
	public void creating_skills_record1(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		Skillspage S1= new Skillspage();
		S1.passdriver(driver);
		S1.addskills1(dataTable);
	}
	@When("Click on logout button")
	public void click_on_logout_button() {
		Homepage H1=new Homepage();
		H1.passdriver(driver);
		H1.logout();
		
	}
	@Then("Close Browser")
	public void close_browser() {
		driver.close();
	}

}
