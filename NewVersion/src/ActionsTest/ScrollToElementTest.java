package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(3000);
		
		//To Find the Download link
		WebElement downloadlink = driver.findElement(By.xpath("//a[.='jdk-8u401-linux-i586.rpm']"));
		Thread.sleep(2000);
		
		//To Create the actions Object
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.scrollToElement(downloadlink).perform();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	}
}
