package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static Scanner sc=new Scanner(System.in);
	static WebDriver driver;

	public static void main(String[] args)throws Exception {
		
		//To Select the Input
		System.out.println("\t\t\tSelect the Browser");
		System.out.println("1.Chrome browser\n2.Edge Browser\n3.FireFox browser");
		int Browser=sc.nextInt();
		
		//To Validate the Browser
		if(Browser==1)
		{
			driver=new ChromeDriver();
		} 
		else if(Browser==2)
		{ 
			driver=new EdgeDriver();
		}
		else if(Browser==3)
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("In Valid Input");
		}
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate to Url
		driver.get("https://Zomato.com");
		Thread.sleep(2000);
		
		//To Quit the Browser
		driver.quit();
		
	}
}
