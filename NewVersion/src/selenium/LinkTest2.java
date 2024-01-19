package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest2 {

	public static void main(String[] args)throws Exception {

		//To launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the Webpage
		driver.manage().window().maximize();
		
		//To navigate to Webpage
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//Click on book Link
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		Thread.sleep(2000);
		//Click on Computer link
		driver.findElement(By.linkText("Computers")).click();
		
		Thread.sleep(2000);
		//Click on the books link using HTML text
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
		
		Thread.sleep(3000);
		//To Quit the application
		//driver.quit();
	}

}
