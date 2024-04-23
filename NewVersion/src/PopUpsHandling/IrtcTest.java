package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrtcTest {

	public static void main(String[] args) throws InterruptedException {
		
		//To Disable the Notificatio
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//Launch the Browser
		WebDriver driver = new  ChromeDriver(option);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://irctc.co.in");
		Thread.sleep(3000);
		
		//To Fill Orgin name 
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("Chennai Central");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//span[contains(.,' CHENNAI EGMORE - MS ')]")).click();
		Thread.sleep(3000);
		
		//To Fill the Destination
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("Madurai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//span[contains(.,' MADURAI JN - MDU ')]")).click();
		Thread.sleep(3000);
		
		//To select the date
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='23']")).click();
		
		//To click on All classes
		driver.findElement(By.xpath("//div[@class='form-group']//span[.='All Classes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'AC First Class (1A) ')]")).click();
		Thread.sleep(3000);
		
		//To Click on General
		driver.findElement(By.xpath("//span[.='GENERAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//span[contains(.,'GENERAL')]")).click();
		Thread.sleep(3000);
		
		//To click on Flexible date
		driver.findElement(By.xpath("//label[.='Flexible With Date']/..")).click();
		Thread.sleep(3000);
		
		//To click on Train with avliable berth
		driver.findElement(By.xpath("//label[.='Train with Available Berth ']/..")).click();
		Thread.sleep(3000);
		
		//To click on search button
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		Thread.sleep(3000);
		
	}
}
