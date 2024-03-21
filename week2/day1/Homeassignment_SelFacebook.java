package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homeassignment_SelFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ishwarya");
		driver.findElement(By.name("lastname")).sendKeys("Shankar");
		driver.findElement(By.name("reg_email__")).sendKeys("ishwaryasanju01@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ishwaryasanju01@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ishuammu@01");
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("1");
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(2);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text() = 'Female']"));

	}

}
