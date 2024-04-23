package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollToOrginTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(3000);
		
		//To find the element of Download link
		WebElement downloadlink = driver.findElement(By.xpath("//a[.='jdk-8u401-linux-i586.rpm']"));
		Thread.sleep(3000);
		ScrollOrigin origin=ScrollOrigin.fromElement(downloadlink);
		
		//To Create Action Object
		Actions action=new Actions(driver);
		action.scrollToElement(downloadlink).perform();
		Thread.sleep(3000);
		action.scrollFromOrigin(origin, 0, 5000).perform();
		Thread.sleep(3000);
		action.scrollFromOrigin(origin, 2000, 0).perform();
		Thread.sleep(5000);
		
		
		//To close the Browser
		driver.quit();
	}
}
