package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukiriTest {
	public static void main(String[] args)throws Exception {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To navigate to Webpage
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		//To Click on Registry Link
		driver.findElement(By.partialLinkText("Register")).click();
		
		//Get the Dimension of the Name
		Dimension SizeOfName=driver.findElement(By.id("name")).getSize();
		
		int heightOfName=SizeOfName.height;
		int WidthOfName=SizeOfName.width;
		
		System.out.println("Height of Name:"+SizeOfName.height);
		System.out.println("Width of Name:"+SizeOfName.width);
		System.out.println();
		
		//Get the Dimension of Email
		int heightOfEmail=driver.findElement(By.id("email")).getSize().height;
		int widthOfEmail=driver.findElement(By.id("email")).getSize().width;
		
		System.out.println("Height of Email:"+heightOfEmail);
		System.out.println("Width of Email:"+widthOfEmail);
		System.out.println();
		
		//Get the Dimension of password
		int heightOfPassword=driver.findElement(By.id("password")).getSize().height;
		int widthOfPassword=driver.findElement(By.id("password")).getSize().width;
		
		System.out.println("Height of Password:"+heightOfPassword);
		System.out.println("Width of Password:"+widthOfPassword);
		System.out.println();
		
		//Get the Dimension of MobileNumber
		int heightOfMobile=driver.findElement(By.id("mobile")).getSize().height;
		int widthOfMobile=driver.findElement(By.id("mobile")).getSize().width;
		
		System.out.println("Height Of Mobile:"+heightOfMobile);
		System.out.println("Width of Mobile:"+widthOfMobile);
		System.out.println();
		
		//To Validate the Dimension
		if(heightOfName==heightOfEmail && heightOfEmail==heightOfPassword && heightOfPassword==heightOfMobile && heightOfMobile==heightOfName)
		{
			System.out.println("*****Result*****");
			System.out.println("Test Case is Pass");
		}
		else System.out.println("Test Case is Fail");
		
		//To Validate the Width Dimension
		if(WidthOfName==widthOfEmail && widthOfEmail==widthOfPassword && widthOfPassword==widthOfMobile && widthOfMobile==WidthOfName)
		{
			System.out.println("Width Dimension is Pass");
		}
		else
			System.out.println("Width Dimension is Fail");
		
		Thread.sleep(2000);
		//To Close the Webpage
		driver.quit();
	}

}
