package ActionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://Youtube.com");
		Thread.sleep(5000);
		
		//To Create the actions Object
		Actions action=new Actions(driver);
		
		action.scrollByAmount(0, 2000).perform();
		Thread.sleep(3000);
		
		//To Close the browser
		driver.quit();
	}
}
