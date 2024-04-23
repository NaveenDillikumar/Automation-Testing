package ActionsTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RatingsAss2 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Mouse Actions
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(3000);
		
		//To Click on Mouse Hover
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(3000);
		
		//To Click on Ratings Link
		driver.findElement(By.partialLinkText("Ratings")).click();
		Thread.sleep(3000);
		
		//To identify the Stars
		WebElement allstars = driver.findElement(By.xpath("//input[@value='4']/.."));
		Thread.sleep(3000);
		
		//To Create the Actions on Stars
		Actions action=new Actions(driver);
		action.moveToElement(allstars).perform();
		Thread.sleep(3000);
		
		//To close the browser
		driver.quit();
		
		
	}
}
