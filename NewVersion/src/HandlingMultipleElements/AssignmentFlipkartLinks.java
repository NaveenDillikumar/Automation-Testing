package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkartLinks {

		public static void main(String[] args) throws InterruptedException {
			
			//Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//maximize the browser
			driver.manage().window().maximize();
			
			//naviagte to Webpage
			driver.get("https://Flipkart.com");
			Thread.sleep(3000);
			
			//To Print All the links in Flipkart
 			 List<WebElement> alllinks=driver.findElements(By.tagName("a"));
 			 Thread.sleep(3000);
 			 
 			 //To Get The Size of Webpage
 			 System.out.println("Size of Links Are :"+alllinks.size());
 			 
 			 //To Get the All the Links Text
 			 
 			 for (WebElement gettext : alllinks) {
 				 
				String textoflink= gettext.getText();
				System.out.println(textoflink);
			}
 			 
 			 //To Close the Browser
 			 driver.quit();
		}
}
