package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DesktopTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate the Webpage
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//To find the Element of Computers
		WebElement Computerslink = driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(2000);
		
		//To Create the Actions Class
		Actions action=new Actions(driver);
		action.moveToElement(Computerslink).perform();
		
		//To Click on Desktops
		WebElement desktopslink = driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/desktops']"));
		Thread.sleep(3000);
		action.click(desktopslink).perform();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
		
	}
}
