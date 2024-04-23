package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsigmaTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://testsigma.com");
		Thread.sleep(15000);
		
		//Switch to frame
		driver.switchTo().frame("fc_widget");
		
		//To Click on chat button
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		driver.quit();

	}
}
