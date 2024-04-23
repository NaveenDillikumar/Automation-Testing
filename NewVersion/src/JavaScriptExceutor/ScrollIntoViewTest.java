package JavaScriptExceutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewTest {
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demowebshop.tricentis.com/");
		
		//To Give Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To Find the Element
		WebElement Giftcard = driver.findElement(By.xpath("//a[.='$25 Virtual Gift Card']"));
		
		//To Create the JavaScript Executor
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)", Giftcard);
	}
}
