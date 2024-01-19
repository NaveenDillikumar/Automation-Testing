package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args)throws Exception {
		
		//To Launch the Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browseer
		
		driver.manage().window().maximize();
		
		//To Navigate to Webpage
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		
		//To Find the location of Register Element
		Point point=driver.findElement(By.xpath("//h1[.='Register ']")).getLocation();
		System.out.println(point);
		
		//To Print x
		System.out.println("x: "+point.x);
		
		//To Print Y
		System.out.println("Y: "+point.y);
		
		int actualX=point.getX();
		int actualY=point.getY(); 
		
		
		int expectedX=709;
		int exceptedY=135;
		
		
		//Verify the Location of Register
		if(expectedX==actualX && exceptedY==actualY)
		{
			System.out.println("*****Result*****");
			System.out.println("Test Case is pass");
		}
		else System.out.println("*****Result*****"); 
			System.out.println("Test Case is Fail");
			
			//To close the Browser
			driver.quit();
		
	}

}
