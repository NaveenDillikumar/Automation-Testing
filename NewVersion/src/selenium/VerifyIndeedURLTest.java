package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIndeedURLTest {
	public static void main(String[] args)throws Exception {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Webpage
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("https://indeed.com");
		Thread.sleep(3000);
		
		//To Get Current URL
		String ActualURl=driver.getCurrentUrl();
		System.out.println(ActualURl);

		//Verify the URl
		String ExceptedURL="https://indeed.com";
		
		//Validate the URL
		if(ActualURl.equals(ExceptedURL))
		{
			System.out.println("ActualURL : "+ActualURl);
			System.out.println("ExceptedURL : "+ExceptedURL);
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("ActualURL : "+ActualURl);
			System.out.println("ExceptedURL : "+ExceptedURL);
			System.out.println("Test Case Fail");
		}
		
		//To Close the Browser
		driver.quit();
	}

}
//Answer is Test Case Fail.
