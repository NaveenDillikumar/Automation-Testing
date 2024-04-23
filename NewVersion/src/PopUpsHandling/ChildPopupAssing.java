package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupAssing {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on Ui Testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Popups link
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		
		//To Click on Browser Windows link
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		Thread.sleep(3000);
		
		//To Click on Open new window button
		driver.findElement(By.id("browserLink1")).click();
		Thread.sleep(2000);
		
		//To Get the Address of parent window
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		Thread.sleep(2000);
		
		//To Get the all the window adress
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Total Number of windows Present : "+allwindows.size());
		for (String windows : allwindows) {
			driver.switchTo().window(windows);
			String url = driver.getCurrentUrl();
			
			//To Move u Next window
			if(url.contains("Sign Up")) {
				break;
			}
		}
		//To Maximize the Webpage
		driver.manage().window().maximize();
		
		//To Fill the Email Text field
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		
		//To fill the Password
		driver.findElement(By.id("password")).sendKeys("abc123456");
		Thread.sleep(2000);
		
		//To Fill The Confirm Password
		driver.findElement(By.id("confirm-password")).sendKeys("abc123456");
		Thread.sleep(2000);
		
		//To Click on Sigup Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.close();
		
		//To Move to parent Window
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		
		//To Click on Multiple Windows Link
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		Thread.sleep(2000);
		
		//To Click the Popup window button
		driver.findElement(By.id("browserButton3")).click();
		Thread.sleep(3000);
		
		//To Get the Parent Windows address
		String multipleparent = driver.getWindowHandle();
		System.out.println(multipleparent);
		
		//To Get the Address of all the Windows
		Set<String> qspwindows = driver.getWindowHandles();
		System.out.println("Total Number of Windows Opened :"+qspwindows.size());
		for (String allqspwindows : qspwindows) {
			driver.switchTo().window(allqspwindows);
			String allqspurl = driver.getCurrentUrl();
			
			//To Move to Sign up url
			if(allqspurl.contains("Sign Up")) {
				break;
			}
		}
		
		//To Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//To Fill the Email Text field
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
				
		
		//To fill the Password
		driver.findElement(By.id("password")).sendKeys("abc123456");
		Thread.sleep(2000);
				
		//To Fill The Confirm Password
		driver.findElement(By.id("confirm-password")).sendKeys("abc123456");
		Thread.sleep(2000);
				
		//To Click on Sigup Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
				
		//To Close the Browser
		driver.close();
		
		//Switch to parent Windows
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		
		//To Move to Next windows
		for (String loginwindow : qspwindows) {
				driver.switchTo().window(loginwindow);
				String loginurl = driver.getCurrentUrl();
							
		//To Move to sign up page
		if(loginurl.contains("Login")) {
			break;
		}
		}
		//To Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
						
		//To Fill the Username text Field
		driver.findElement(By.id("username")).sendKeys("abc123");
		Thread.sleep(2000);
						
		//To Fill the Password field
		driver.findElement(By.id("password")).sendKeys("abc123456");
		Thread.sleep(2000);
						
		//To Click on Login Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
								
		//To Close the Browser
		driver.close();
		
		//To Switch to Parent window
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		
		//To move to sign up window
		for (String Signupwindow : qspwindows) {
			driver.switchTo().window(Signupwindow);
			String signupurl = driver.getCurrentUrl();
			
			if(signupurl.contains("SignUp")) {
				break;
			}
		}
		//To Maximize the Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To Fill User name Field
		driver.findElement(By.id("username")).sendKeys("abc123");
		Thread.sleep(2000);
		
		//To fill Email field
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		
		//To Fill password field
		driver.findElement(By.id("password")).sendKeys("abc123456");
		Thread.sleep(2000);
		
		//To Click on sign up button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.close();
		
					
		
		
		
		
		
	}
}
