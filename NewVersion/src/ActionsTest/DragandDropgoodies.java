package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropgoodies {
public static void main(String[] args)throws Exception {
	
	//To launch the browser
	WebDriver driver=new ChromeDriver();
			
	//Maximize the browser
	driver.manage().window().maximize();

	//Navigate to webpage
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(3000);
			
	//To drag and drop washington and USA
	WebElement Washington=driver.findElement(By.id("box3"));
	Thread.sleep(3000);
	WebElement USA=driver.findElement(By.id("box103"));
	Thread.sleep(3000);
			
	//To create an object
	Actions action=new Actions(driver);
	action.dragAndDrop(Washington,USA).perform();
	Thread.sleep(3000);
			
	//to drag and drop the element Rome and Italy
	WebElement Rome=driver.findElement(By.id("box6"));
	Thread.sleep(3000);
	WebElement Italy=driver.findElement(By.id("box106"));
	Thread.sleep(3000);
	action.dragAndDrop(Rome, Italy).perform();
	Thread.sleep(2000);
			
	//To Close the BRowser
	driver.quit();
			
			

		}

	}
