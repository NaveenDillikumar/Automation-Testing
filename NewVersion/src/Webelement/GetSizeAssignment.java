package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To click on Ui Testing Link
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//Find the name Text field
		WebElement nametf = driver.findElement(By.id("name"));
		int heightofnameTF=nametf.getSize().height;
		int widthofnameTF=nametf.getSize().width;
		
		//Find the Email text field
		WebElement emailtf = driver.findElement(By.id("email"));
		int heightofemailtf=emailtf.getSize().height;
		int widthofemailtf=emailtf.getSize().width;
		
		//Find the Password Text field
		WebElement passwordtf = driver.findElement(By.id("password"));
		int heightofpasswordtf=passwordtf.getSize().height;
		int widthofpasswordtf=passwordtf.getSize().width;
		
		//To Print the Sizes
		System.out.println("Height of name Text field :"+heightofnameTF);
		System.out.println("Width of name Text field :"+widthofnameTF);
		System.out.println();
		
		System.out.println("Height of email Text field :"+heightofemailtf);
		System.out.println("Width of email Text field :"+widthofemailtf);
		System.out.println();
		
		System.out.println("Height of password Text field :"+heightofpasswordtf);
		System.out.println("Width of password Text field :"+widthofpasswordtf);
	
		System.out.println();
		System.out.println("*********Test case Results**********");
		System.out.println();
		
		//To Validate the Height sizes
		if(heightofnameTF==heightofemailtf && heightofemailtf==heightofpasswordtf && heightofpasswordtf==heightofnameTF) {
			System.out.println("Height Test case is Pass");
		}
		else {
			System.out.println("Height Test case is fail");
		}
		
		//To Validate the Width sizes
		if(widthofnameTF==widthofemailtf && widthofemailtf==widthofpasswordtf && widthofpasswordtf==widthofnameTF) {
			System.out.println("Width Test case is pass");
		}
		else {
			System.out.println("Width Test case is Fail");
		}
		
		//To Close the Browser
		driver.quit();
	}
}
