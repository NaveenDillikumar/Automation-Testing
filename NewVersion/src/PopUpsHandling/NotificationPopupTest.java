package PopUpsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupTest {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//To Disabling the Alert
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://easemytrip.com");
		Thread.sleep(7000);
		
		
		//To Create Robot object
		Robot robo=new Robot();
		
		//To Press tab button on Keyboard actions
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		//to Click Enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		//To Close the Browser
		driver.quit();
		
	}
}
