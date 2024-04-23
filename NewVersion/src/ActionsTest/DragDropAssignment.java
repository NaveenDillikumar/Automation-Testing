package ActionsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		///Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		
		//To Find the Capitals
		Actions action=new Actions(driver);
		List<WebElement> allcapitals = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
		Thread.sleep(3000);
		
		//TO find the Countries
		List<WebElement> allcountries = driver.findElements(By.xpath("//div[@id='countries']/div"));
		Thread.sleep(3000);
		
		//Matching the All the Countries and Capitals
		for(int i=1;i<allcapitals.size();i+=2) {
			for(int j=0;j<allcountries.size();j++) {
				
				action.dragAndDrop(allcapitals.get(i), allcountries.get(j)).perform();
				Thread.sleep(2000);
				System.out.println(allcapitals.get(i).getCssValue("background-color"));
				if(allcapitals.get(i).getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
					break;
				}
				}
		}
		
		//TO close the browser
		driver.quit();
	}
}
