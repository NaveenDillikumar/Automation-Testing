package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerthandlingTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Web page
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Pop ups link
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		
		//To click on java script link
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		Thread.sleep(3000);
		
		//To the Alert box button
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(3000);
		
		//To Click on Ok  Alert Notification
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//To Click on confirm link
		driver.findElement(By.partialLinkText("Confirm")).click();
		Thread.sleep(3000);
		
		//To Click Confirm Alert button
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(3000);
		
		//To Click ok on Confirm alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//To Click on Prompt link
		driver.findElement(By.partialLinkText("Prompt")).click();
		Thread.sleep(3000);
		
		//To Click Prompt Button
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(3000);
		
		//To Handle the Prompt alert
		Alert Notification = driver.switchTo().alert();
		Notification.sendKeys("yes");
		Thread.sleep(1000);
		String TextofAlert = Notification.getText();
		System.out.println(TextofAlert);
		Thread.sleep(1000);
		Notification.accept();
		Thread.sleep(3000);
		
		//To close the Browser
		driver.quit();
	}
}
