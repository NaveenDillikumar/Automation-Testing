package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldTest {

	public static void main(String[] args) throws InterruptedException {
	  // launch the browser
	  WebDriver driver=new ChromeDriver();
	  
	  //maximize the browser
	  driver.manage().window().maximize();
	  
	  //to get the url
	  driver.get("https://demoapps.qspiders.com/");
	  
	  //To click on UI testing
	  driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	  Thread.sleep(3000);
	  
	  //to click on mouse action button
	  driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
	  Thread.sleep(3000);
	  
	  //to click on click and hold button
	  driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
	  Thread.sleep(3000);
		
	  //to click on circle button
	  WebElement circlebutton=driver.findElement(By.id("circle"));
	  Thread.sleep(3000);
	  
	  Actions action=new Actions(driver);
	  
	  action.clickAndHold(circlebutton).perform();
	  Thread.sleep(3000);
	  
	  action.release(circlebutton).perform();
	  Thread.sleep(3000);
	  
	  // to close the browser
	  driver.quit();
	}
}
