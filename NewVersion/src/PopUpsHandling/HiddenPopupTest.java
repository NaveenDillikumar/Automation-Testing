package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopupTest {
	public static void main(String[] args) throws InterruptedException {
		
	//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
	//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Web Page
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Popups Link
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		
		//To Click on Hidden Division Link
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(3000);
		
		//To Fill the Name Text Field
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		//To Fill the email details
		driver.findElement(By.xpath("//label[.='Email']/../..//input")).sendKeys("Naveendcraz31@gmail.com");
		Thread.sleep(3000);
		
		//To Handle The dropdown
		WebElement dropdown = driver.findElement((By.xpath("//label[.='Product']/..//select")));
		Thread.sleep(3000);
		Select productdropdown=new Select(dropdown);
		System.out.println("Is the Dropdown is Multiple :"+productdropdown.isMultiple());
		Thread.sleep(3000);
		productdropdown.selectByVisibleText("Mobile");
		Thread.sleep(3000);
		
		//To Fill the Messsage field
		driver.findElement(By.xpath("//label[.='Message']/..//textarea")).sendKeys("Hi.. I am naveen");
		Thread.sleep(3000);
		
		//To click on submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	
	
	
	
	
	
	}	
}
