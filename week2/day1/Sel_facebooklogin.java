package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_facebooklogin {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("9092514031");
		driver.findElement(By.id("pass")).sendKeys("Ishuammu01");
	
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.contains("Facebook")) {
			System.out.println("Login is Successful");
		}
		else{
			System.out.println("Login is not successful");
		}
	}
}
