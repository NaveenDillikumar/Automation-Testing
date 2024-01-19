package selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsAppLaunch {

	public static void main(String[] args)throws Exception{

		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate the Browser
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(20000);
		//To Click on status
	//	driver.findElement(By.cssSelector("[aria-label='Status']")).click();
		driver.findElement(By.xpath("//span[.='Thomson Bro Qsp']")).click();
      Thread.sleep(10000);
		while(true) {
		 driver.findElement(By.cssSelector("[role=textbox][tabindex='10']")).sendKeys("hi");
		}

	}

}
