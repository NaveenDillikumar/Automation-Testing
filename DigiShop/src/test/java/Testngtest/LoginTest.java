package Testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(groups = "Function")
	public void Login_001(){
		WebDriver driver=new ChromeDriver();
		Reporter.log("Login_001",true);
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test(groups = "Intergration")
	public void Login_002() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Login_002",true);
		driver.manage().window().maximize();
		driver.quit();
	}
	@Test(groups = "Smoke")
	public void Login_003() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Login_003");
		driver.manage().window().maximize();
		driver.get("naveen");
		driver.quit();
	}
	
}
