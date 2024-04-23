package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		//To find the Web element
		WebElement Searchfield = driver.findElement(By.id("APjFqb"));
		
		//To Create the actions Object
		Actions action=new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys("hi how are u").perform();
		Thread.sleep(3000);
		action.keyUp(Keys.SHIFT).sendKeys("i am fine").perform();
		Thread.sleep(3000);
		
		//By using Parameters
		action.keyDown(Searchfield, Keys.SHIFT).sendKeys("what is ur name").perform();
		Thread.sleep(3000);
		action.keyUp(Searchfield, Keys.SHIFT).sendKeys("my name is naveen").perform();
		Thread.sleep(3000);
		
		//To close the browser
		driver.quit();
		
	}
}
