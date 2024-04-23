package Testngtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoappsDataProvider {

	@DataProvider(parallel = true)
	public String[] [] details(){
		String [] [] data= new String[3][3];
		
		//First details
		data[0] [0]="Naveen";
		data[0] [1]="Naveen@gmail.com";
		data[0] [2]="Naveen123";
		
		//Second Details
		data[1] [0]="Dillikumar";
		data[1] [1]="Dillikumar@gmail.com";
		data[1] [2]="Dillikumar123";
		
		//Third Details
		data[2] [0]="Sindhunathi";
		data[2] [1]="Sindhunathi@gmail.com";
		data[2] [2]="Sindhunathi123";
		return data;
	}
	
	@Test(dataProvider = "details")
	public void Login_001(String Name, String Emailid, String Password) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To Click on Ui Testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		
		//To Enter the Name
		driver.findElement(By.id("name")).sendKeys(Name);
		Thread.sleep(1000);
		
		//To Enter the Email 
		driver.findElement(By.id("email")).sendKeys(Emailid);
		Thread.sleep(1000);
		
		//To Enter the Password
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(1000);
		
		//To Click on Register button
		driver.findElement(By.xpath("//button[.='Register']")).submit();
		Thread.sleep(1000);
		
		//To Close The Browser
		driver.quit();
	}
}
