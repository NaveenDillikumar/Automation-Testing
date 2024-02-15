package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnRadioButton {

public static void main(String[] args) throws InterruptedException {

	
	//Launch the browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Navigate to webpage
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(3000);
	
	//To Click on UI testing link
	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	Thread.sleep(3000);
	
	//To Click on RadioButton link
	driver.findElement(By.xpath("//section[.='Radio Button']")).click();
	Thread.sleep(3000);
	
	//To Click on Radiobutton
	List<WebElement> radiobutton=driver.findElements(By.xpath("//form//input[@type='radio']"));
	Thread.sleep(3000);
	
	//To print the Size of RadioButton
	System.out.println("Size of Radiobutton is :"+radiobutton.size());
	
	//To click All the Radiobutton
	for (WebElement allradiobutton : radiobutton) {
		
		allradiobutton.click();
		Thread.sleep(700);
	}
	
	//To close the Browser
	driver.quit();
	
	
}
}
	

