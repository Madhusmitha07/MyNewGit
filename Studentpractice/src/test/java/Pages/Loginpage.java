package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	//By Username= By.name("username");
	//By PassWord = By.name("password");
	//By loginbutton=By.xpath("//button[@type='submit']");
	
	
	
	
	public void passdriver(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	
	public void login(String username1,String password1)
	{
		userName.sendKeys(username1);
		passWord.sendKeys(password1);
		loginbutton.click();
	}
}
