package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeTest {
	public static void main(String[] args)throws Exception {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate to webpage
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		
		//Get the Size of the TextField
		Dimension sizeOfName=driver.findElement(By.id("name")).getSize();
		
		int heightofName=sizeOfName.height;
		int widthofName=sizeOfName.width;
		
		System.out.println("Height of Name:"+sizeOfName.height);
		System.out.println("Width of Name:"+sizeOfName.width);
		
		//Get the Size of Email text Field
		int heightOfEmail=driver.findElement(By.id("email")).getSize().height;
		int widthOfEmail=driver.findElement(By.id("email")).getSize().width;
		
		System.out.println("Height of Email:"+heightOfEmail);
		System.out.println("Width of Email:"+heightofName);
		
		//Get the size of Password
		int heightOfPassword=driver.findElement(By.id("password")).getSize().height;
		int widthOfPassword=driver.findElement(By.id("password")).getSize().width;
		
		System.out.println("Height of Password"+heightOfPassword);
		System.out.println("Width of Password"+widthOfPassword);
		
		//To Validate the Dimensions
		if(heightofName==heightOfEmail && heightOfEmail==heightOfPassword && heightOfPassword==heightofName)
		{
			System.out.println("Test Case is Passed");
		}
		else System.out.println("Test case is Fail");
		
		//To Validate the Width Dimension
		if(widthofName==widthOfEmail && widthOfEmail==widthOfPassword && widthOfPassword==widthofName)
		{
			System.out.println("Width Test case is pass");
		}
		else System.out.println("Width Test case is Fail ");
		
		//To Close the Webpage
		driver.quit();
		
		
		
		
	}

}
