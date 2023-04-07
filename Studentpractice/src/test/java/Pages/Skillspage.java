package Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class Skillspage {

	WebDriver driver;
	By Admin= By.xpath("//span[text()='Admin']");
	By Qualifications= By.xpath("//span[text()='Qualifications ']");
	By Skills= By.xpath("//a[text()='Skills']");
	By add = By.xpath("//button[text()=' Add ']");
	By skillname= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By skilldesc = By.xpath("//textarea[@placeholder='Type description here']");
	By save= By.xpath("//button[text()=' Save ']");
	
	public void passdriver(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void addskills(String Skillname1,String Skilldesc1) throws InterruptedException
	{
		driver.findElement(Admin).click();
		driver.findElement(Qualifications).click();
		driver.findElement(Skills).click();
		driver.findElement(add).click();
		  
		driver.findElement(skillname).sendKeys(Skillname1);
		driver.findElement(skilldesc).sendKeys(Skilldesc1);
		  
		  Thread.sleep(5000);
		  driver.findElement(save).click();
	}

	public void addskills1(DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> SkillsData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<SkillsData.size();i++) {
			
			String SkillName=SkillsData.get(i).get("SkillName");
			String SkillDescr=SkillsData.get(i).get("SkillDescr");
			
			System.out.println("____________________________");
			
			driver.findElement(Admin).click();
			driver.findElement(Qualifications).click();
			driver.findElement(Skills).click();
			driver.findElement(add).click();
			  
			driver.findElement(skillname).sendKeys(SkillName);
			driver.findElement(skilldesc).sendKeys(SkillDescr);
			  
			  Thread.sleep(5000);
			  driver.findElement(save).click();
		
	}
	}
	
}
