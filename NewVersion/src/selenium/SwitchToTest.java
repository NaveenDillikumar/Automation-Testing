package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTest {
	
	public static void main(String[] args)throws Exception {
	
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://Google.com");
		Thread.sleep(3000);
		
		driver.switchTo().activeElement().sendKeys("Lord Muruga"+ "4",Keys.ENTER);
		Thread.sleep(5000);
		
		//Close the Browser
		driver.quit();
	}

}
