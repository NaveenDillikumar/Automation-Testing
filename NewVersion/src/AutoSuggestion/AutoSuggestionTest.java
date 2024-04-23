package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Naviagate to webpage
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		//To Identify search box
		driver.findElement(By.name("q")).sendKeys("happy");
		Thread.sleep(3000);
		
		//To print the all the suggestion text
		List<WebElement> allsugesstion = driver.findElements(By.xpath("//div[@role='presentation']//b/.."));
		System.out.println("Total Number of Sugesstion is :"+allsugesstion.size());
		
		for (WebElement sugesstion : allsugesstion) {
			System.out.println(sugesstion.getText());
		}
		
		//To Quit the browser
		driver.quit();
	}
}
