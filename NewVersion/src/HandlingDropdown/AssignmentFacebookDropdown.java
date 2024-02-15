package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebookDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		
		//To Click on Create New Account
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(3000);
		
		//To Fill the First name 
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		//To Fill the Surname
		driver.findElement(By.name("lastname")).sendKeys("Dillikumar");
		Thread.sleep(3000);
		
		//To Fill the Mobile number or email
		driver.findElement(By.name("reg_email__")).sendKeys("7358759146");
		Thread.sleep(3000);
		
		//To Fill the Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("naveen010601");
		Thread.sleep(3000);
		
		//To find the Date dropdown and Selecting date
		WebElement dateofbirth=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date=new Select(dateofbirth);
		System.out.println("Is the date Dropdown is Multiple :"+date.isMultiple());
		date.selectByVisibleText("1");
		Thread.sleep(3000);
		
		//To find the month dropdown and selecting the month
		WebElement monthofbirth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month=new Select(monthofbirth);
		System.out.println("Is Month Dropdown is Multiple :"+month.isMultiple());
		month.selectByVisibleText("Jun");
		Thread.sleep(3000);
		
		//To find the year Drop down and selecting the year
		WebElement yearofbirth=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year=new Select(yearofbirth);
		System.out.println("IS the Year Drop Down is Multiple :"+year.isMultiple());
		year.selectByVisibleText("2001");
		Thread.sleep(3000);
		
		//To Click on Male Radio Button
		driver.findElement(By.xpath("//label[.='Male']/..//input")).click();
		Thread.sleep(3000);
		
		//To Click on Signup Button
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	}	
}
