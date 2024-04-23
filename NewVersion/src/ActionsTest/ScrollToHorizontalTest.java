package ActionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToHorizontalTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		Thread.sleep(3000);
		
		//To create the Actions Object
		Actions action =new Actions(driver);
		Thread.sleep(2000);
		action.scrollByAmount(5000, 0).perform();
		Thread.sleep(3000);
	
		
		//To close the Browser
		driver.quit();
	}
}
