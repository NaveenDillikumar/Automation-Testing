package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchYoutube {

	public static void main(String[] args)throws Exception {

		//To launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Webpage
		driver.manage().window().maximize();
		
		//navigate to Web page
		driver.get("https://youtube.com");
		
		Thread.sleep(4000);
		//To Search Movie And Play Song
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Badass from Leo");
		
		Thread.sleep(3000);
		//To Click on Search Button
		driver.findElement(By.cssSelector("button.ytd-searchbox")).click();
		
		Thread.sleep(3000);
		//To Play the Song
		driver.findElement(By.className("ytd-video-renderer")).click();
		
		Thread.sleep(8000);
		//To skip the Song
		driver.findElement(By.cssSelector("button.ytp-ad-skip-button")).click();
		
		Thread.sleep(3000);
		//To close the Dialogue box
		driver.findElement(By.className("button.feedback-shape__fill")).click();
		

	}

}