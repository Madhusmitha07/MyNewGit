package Gluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Skillspage;
import io.cucumber.java.en.*;

public class steps {

	WebDriver driver;
	
	@Given("User launch chromebrowser")
	public void user_launch_chromebrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait 
	}
	
	
	@When("User opens {string}")
	public void user_opens(String Testurl)
	{
		driver.get(Testurl);
	}
	
	@Given("user logs with username as {string} and password as {string}")
	public void user_logs_with_username_as_and_password_as(String username, String password) 
	{
		Loginpage L1=new Loginpage();
		L1.passdriver(driver);
		L1.login(username, password);
		
	}
	
	@When("user adds skills record with skillname as {string} and skilldesc as {string}")
	public void user_adds_skills_record_with_skillname_as_and_skilldesc_as(String skillname, String skilldesc) throws InterruptedException
	{
		Skillspage S1= new Skillspage();
		S1.passdriver(driver);
		S1.addskills(skillname, skilldesc);
	}
	
	@Then("user performs logout")
	public void user_performs_logout() 
	{
		Homepage H1=new Homepage();
		H1.passdriver(driver);
		H1.logout();
		
	}
	
	@Then("closes the browser")
	public void closes_the_browser()
	{
		driver.close();
		
	}

}
