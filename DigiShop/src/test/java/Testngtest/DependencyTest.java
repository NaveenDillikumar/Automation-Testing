package Testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test(priority = 0,groups = {"Smoke,Function"})
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority=1,groups = "System")
	public void Login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Login");
		driver.get("naveen");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority=2,groups = "System")
	public void Addtocart() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Add To Cart");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority=3,groups = "System")
	public void Payment() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Payments");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
}
