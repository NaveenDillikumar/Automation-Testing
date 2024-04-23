package Testngtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@DataProvider(parallel = true)
	public String[] [] data() {
		String[] [] a=new String[5] [5];
		//First Person Details
				a[0] [0]="Naveen";
				a[0] [1]="Dillikumar";
				a[0] [2]="naveendcraz31@gmail.com";
				a[0] [3]="naveen123";
				a[0] [4]="naveen123";
				
				//Second Person
				a[1] [0]="Dillikumar";
				a[1] [1]="Sivaprakasam";
				a[1] [2]="dillikumar@gmail.com";
				a[1] [3]="dillikumar123";
				a[1] [4]="dillikumar123";
				
				//Third Person Details
				a[2][0]="Pushpalatha";
				a[2][1]="Dillikumar";
				a[2][2]="Latha@gmail.com";
				a[2][3]="Latha123";
				a[2][4]="Latha123";
				
				//Fourth Person Details
				a[3] [0]="Sindhunathi";
				a[3] [1]="Chidabaram";
				a[3] [2]="Sindhu@gmail.com";
				a[3] [3]="Sindhu123";
				a[3] [4]="Sindhu123";
				
				//Fifth Member
				a[4] [0]="Sanjay";
				a[4] [1]="Nehru";
				a[4] [2]="Sanjay@gmail.com";
				a[4] [3]="Sanjay123";
				a[4] [4]="Sanjay123";

		
		return a;
	}

	@Test(dataProvider = "data")
	public void Register(String Firstname, String Lastname, String Email, String Password, String Confirmpassword) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To Click on Register link
		driver.findElement(By.partialLinkText("Register")).click();
		
		//To Click on Male Button
		driver.findElement(By.id("gender-male")).click();
		
		//To Enter the First Name
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		
		//To Enter the Last Name
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		
		//To Enter the Email
		driver.findElement(By.id("Email")).sendKeys(Email);
		
		//To Enter the Password
		driver.findElement(By.id("Password")).sendKeys(Password);
		
		//To Enter the Confirm Password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
		
		//To Click on Register link
		driver.findElement(By.id("register-button")).click();
		
		//To Close the Browser
		driver.quit();
	}
}
