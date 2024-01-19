package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserByUser {
	static Scanner sc=new Scanner(System.in);
	static WebDriver driver;
	
	public static void main(String[] args)throws Exception {
		
		//To Get the Tittle of Browser By User
		System.out.println("\t\t\tEnter the Browser Name");
		String Browser=sc.next();
		
		//To Validate the Browser Name
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
			}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser Name, Launching Default Browser");
			driver=new ChromeDriver();
		}
		
		//To Maximize the Webpage
		driver.manage().window().maximize();
		
		//To Navigate the browser
		driver.get("https://Swiggy.com");
		Thread.sleep(3000);
		
		//TO close the Browser
		driver.quit();
	}

}
