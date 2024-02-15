package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickonCheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		
		//To Click UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To click on checkbox
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(3000);
		
		//To click on Email checkbox
		List<WebElement> allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);
		
		//To print Size of text box
		System.out.println("Size of check box : "+allcheckbox.size());
		
		//To click on all Checkbox
		for (WebElement checkbox : allcheckbox) {
			
			checkbox.click();
			Thread.sleep(700);
		}
		
		//To Disselect the All the checkbox
		
		
		for (WebElement checkbox : allcheckbox) {
			
			checkbox.click();
			Thread.sleep(700);
		}
		
		//To quit the browser
		driver.quit();
	}
}
