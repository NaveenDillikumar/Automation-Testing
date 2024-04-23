package GenericLibraries;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass extends Utilitymethods {
	 public WebDriver driver;
	 public  static ExtentReports report;
	 public static ExtentTest test;
	
	@BeforeSuite
	public void bs() {
		Reporter.log("Data base is Connected",true);
		report=new ExtentReports("./Reports/"+getTime()+".html");
	}
	
	@AfterSuite
	public void as() {
		Reporter.log("Close Data Base Connection",true);
		report.flush();
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("Before Test",true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("After Test",true);
	}
	
	@Parameters({"Browsers","url"})
	
	@BeforeClass
	public void Launchthebrowser(String Browsers, String url) {
		
		if(Browsers.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		}
		else if(Browsers.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(Browsers.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Reporter.log("Launched Browser",true);
	}
	
	@AfterClass
	public void BrowserClosed() {
		driver.quit();
		
		Reporter.log("Browser closed",true);
	}
	
	@BeforeMethod
	public void Login(Method method) {
		
		test=report.startTest(method.getName());
		
		//To Click on login Link
		driver.findElement(By.partialLinkText("Log in")).click();
		
		//To Enter the Email
		driver.findElement(By.id("Email")).sendKeys("callme2422c@gmail.com");
		
		//To Enter the Password
		driver.findElement(By.id("Password")).sendKeys("Naveen@010601");
		
		//To Click on Login Button
		driver.findElement(By.className("login-button")).submit();
		
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.partialLinkText("Log out")).click();
		
		Reporter.log("Log Out",true);
		
		report.endTest(test);
	}
}
