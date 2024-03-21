package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homeassignment_Leaftaps {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	driver.get("http://leaftaps.com/opentaps/");
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String title = new String(driver.getTitle());
	
	if(title.contains("Leaftaps")) {
		System.out.println("Login is Successful");
	}
	else {
		System.out.println("Login is not Successful");
	}
	
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Account")).click();

	driver.findElement(By.id("accountName")).sendKeys("Ishwarya");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	Select industry = new Select(driver.findElement(By.name("industryEnumId")));
	industry.selectByIndex(2);
	
	Select own = new Select(driver.findElement(By.name("ownershipEnumId")));
	own.selectByVisibleText("S-Corporation");
	
	Select source = new Select(driver.findElement(By.id("dataSourceId")));
	source.selectByValue("LEAD_EMPLOYEE");
	
	Select marcamp = new Select(driver.findElement(By.id("marketingCampaignId")));
	marcamp.selectByIndex(5);
	
	Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
	state.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	WebElement Accountname = driver.findElement(By.className("tabletext"));
	
	System.out.println(Accountname);
	
	driver.close();
	
	
	}
	}
