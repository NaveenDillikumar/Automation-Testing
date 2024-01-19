package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args)throws Exception {
		
		//To launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate the webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//To find the registerlink
		WebElement registerlink= driver.findElement(By.linkText("Register"));
		
		//To Find the color of the Register
		String actualresult=registerlink.getCssValue("color");
		System.out.println(actualresult);
		
		String exceptedResult="rgba(175, 3, 4, 0)";

		//To verify the color of Register
		if(exceptedResult.equals(actualresult))
		{
			System.out.println("Test case is Pass");
			System.out.println(actualresult);
			System.out.println(exceptedResult);
		}
		else System.out.println("Test case is Fail");
		     System.out.println(actualresult);
		     System.out.println(exceptedResult);
		     
		     //To find the Background color
		     System.out.println(registerlink.getCssValue("background"));
		
		     Thread.sleep(3000);
		//To Close the Browser
		driver.quit();
	}

}

