package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirthTest {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Web page
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Date and Time Picker link
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(3000);
		
		//To Click on Date Picker
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(3000);
		
		//To Click on Select the Date
		driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		Thread.sleep(3000);
		
		//To Identify the Month
		WebElement Month = driver.findElement(By.xpath("//div[.='March 2024']"));
		
		//Using While Loop To Select the Dob
		while(!Month.getText().equals("June 2001")) {
			driver.findElement(By.xpath("//button[contains(@class,'react-datepicker__navigation react-datepicker__navigation--previous')]")).click();
			
		}
		//To Select the Date
		WebElement Date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']"));
		Date.click();
		Thread.sleep(3000);
		
		
		//To close the Browser
		driver.quit();
		
	}
}
