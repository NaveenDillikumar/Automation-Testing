package GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utilitymethods {
	
	public static void getWebpageScreenshot(WebDriver driver) {
		
		//Step:1 Convert Web driver reference into take screenshot type
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		//Step:2 Get the screenshot and store in temp
		File temp= ts.getScreenshotAs(OutputType.FILE);
		
		//Step:3 Create the Permanent Location
		File permanent=new File("./Screenshots/"+getTime()+".png");
		
		//Step:4 copy paste the image from temperory to permanent location
		try {
			FileHandler.copy(temp, permanent);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static String getTime() {
		return LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
		
	}
	
	public static void getWebelementScreenshot(WebElement element) {
		
		//Get the screenshot and store in temp location
		File temp = element.getScreenshotAs(OutputType.FILE);
		
		//Step:2 create a permanent file location
		File permanent = new File("./Screenshots"+getTime()+".png");
		
		//Step :3 copy the temp to permanent location
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void SelectOptionByIndex(WebElement dropdown,int index) {
		//To create the Select object
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	public static void SelectOptionByValue(WebElement dropdown,String value) {
		//To create the Select object
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	public static void SelectOptionByVisibleText(WebElement dropdown,String text) {
		//To create the Select object
		Select select=new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public static void SwitchToWindowByTitle(WebDriver driver,String title) {
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title)) {
				break;
			}
			
		}
	}
	
	public static void SwitchToWindowByUrl(WebDriver driver,String url) {
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
			driver.switchTo().window(window);
			
			if(driver.getCurrentUrl().contains(url)) {
				break;
			}
			
		}
	}
	
	public static void Action(WebDriver driver,WebElement element ) {
		Actions action=new Actions(driver);
		action.click(element).perform();
	}

}
