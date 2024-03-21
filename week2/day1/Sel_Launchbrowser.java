package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Launchbrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();

	}

}
