package JavaScriptExceutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindtheEndofPage {

		public static void main(String[] args) {
			
			//launch the Browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the Browser
			driver.manage().window().maximize();
			
			//Navigate to Webpage
			driver.get("https://demowebshop.tricentis.com");
			
			// To give implicity wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//To Create the Java script object
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		}
}
