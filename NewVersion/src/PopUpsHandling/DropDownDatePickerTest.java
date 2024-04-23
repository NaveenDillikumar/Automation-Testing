package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDatePickerTest {

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
		
		//To click on Drop down Date Picker link
		driver.findElement(By.partialLinkText("Dropdown DatePicker")).click();
		Thread.sleep(3000);
		
		//To Click on Select date 
		driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		Thread.sleep(3000);
		
		//To Select the Month
		driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']")).click();
		Thread.sleep(3000);
		
		//To Click on June Month
		driver.findElement(By.xpath("//div[.='Jun']")).click();
		Thread.sleep(3000);
		
		//To Select the Year
		driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']")).click();
		Thread.sleep(3000);
		
		while(true) {
			driver.findElement(By.xpath("(//div[@class='react-datepicker__year-option'])[11]")).click();
			driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']")).click();
		try {
		if(driver.findElement(By.xpath("//div[.='2001']")).isDisplayed()) {
			driver.findElement(By.xpath("//div[.='2001']")).click();
			break;
		}
		
		}
		
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
		}
		//To Click on Date
				driver.findElement(By.xpath("//div[.='1']")).click();
				Thread.sleep(3000);
				
				//To Close the Browser
				driver.quit();
		
	}
}
