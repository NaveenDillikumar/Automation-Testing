package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageSourceTest {
	
	public static void main(String[] args)throws Exception {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://Flipkart.com");
		Thread.sleep(3000);
		
		//To Get Source Code
		String Source=driver.getPageSource();
		System.out.println(Source);
		
		//To Close the Browser
		driver.quit();
	}

}
