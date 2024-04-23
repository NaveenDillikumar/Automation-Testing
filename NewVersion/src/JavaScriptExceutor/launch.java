package JavaScriptExceutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
 public static void main(String[] args) {
	
	 WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
	 driver.get("https://www.swiggy.com");
	 
}
}
