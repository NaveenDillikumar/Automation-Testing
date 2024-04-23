package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Navigate to Webpage
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		//To Create the Robot Object
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_E);
		
		robo.keyPress(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_E);
		
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(4000);
		
		//To Close the Browser
		driver.quit();
	}
}
