package JavaScriptExceutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabaleelement {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To click on Ui testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		
		//To Click on disable
		driver.findElement(By.xpath("//li[.='Disabled']")).click();
		
		//To import Java script executor
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//To find name text field
		WebElement Name = driver.findElement(By.id("name"));
		
		//To find email text field
		WebElement Email = driver.findElement(By.id("email"));
		
		//To Find password field
		WebElement Password = driver.findElement(By.id("password"));
		
		jse.executeScript("arguments[0].value='Naveen';arguments[1].value='naveendcraz31@gmail.com';arguments[2].value='naveen@123';", Name,Email,Password);
		//jse.executeScript("arguments[1].value='naveendcraz31@gmail.com';", Email);
		
	}
}
