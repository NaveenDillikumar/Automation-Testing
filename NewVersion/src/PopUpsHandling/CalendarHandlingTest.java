package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingTest {

	public static void main(String[] args) throws InterruptedException {

		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To click on UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Date And time Picker
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(3000);
		
		//To Click on Date Picker
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(3000);
		
		//To Click on Select the Date
		driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		Thread.sleep(3000);
		
		//To  Select the Date of today
		driver.findElement(By.xpath("//div[@class='react-datepicker__week']//div[@tabindex='0']")).click();
		Thread.sleep(3000);
		
		//Next Method
		//driver.findElement(By.xpath("//div[@aria-current='date']")).click();
		
		
		
		
		
	}
}
