package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebshopSystemTesting {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com");
		
		//Impilicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explict wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//To Click on Login Button
		driver.findElement(By.partialLinkText("Log in")).click();
		
		//To Enter the Email Address
		driver.findElement(By.id("Email")).sendKeys("callme2422c@gmail.com");
		
		//To Enter the Passsword
		driver.findElement(By.id("Password")).sendKeys("Naveen@010601");
		
		//To Click on Login Button
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		//To Click on Jewelry
		driver.findElement(By.partialLinkText("Jewelry")).click();
		
		//To click on Black Heart Jewelry
		driver.findElement(By.xpath("//a[.='Black & White Diamond Heart']")).click();
		
		//To Click on Add to Cart
		driver.findElement(By.id("add-to-cart-button-14")).click();
		
		//To Open shoping Cart
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		
		//To click on terms and Condition
		driver.findElement(By.id("termsofservice")).click();
		
		//To Select the Country
		WebElement country = driver.findElement(By.id("CountryId"));
		Select select=new Select(country);
		System.out.println("Is The Dropdown is Multiple :" +select.isMultiple());
		select.selectByVisibleText("India");
		
		//To enter the Zip code
		driver.findElement(By.id("ZipPostalCode")).sendKeys("600103");
		
		//To click on Check Out Button
		driver.findElement(By.id("checkout")).click();
		
		//To Select the country Drop down
		WebElement Billingcountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select selectcountry=new Select(Billingcountry);
		selectcountry.selectByVisibleText("India");
		
		//To Enter the City
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Chennai");
		
		//To enter the Address
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("No-52/21LIG-II");
		
		//To Enter the Address
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Manali New Town");
		
		//To Enter the Zipcode
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("600103");
		
		//To enter the Phone Number
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("7358759146");
		
		//To Click on Continue button
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input[@title='Continue']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")));
		
		//To click on shipping Continue Button
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")).click();
		
		//To select The Shipping options
		driver.findElement(By.id("shippingoption_1")).click();
		
		//To click on shipping Continue
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input")).click();
		
		//To click on Payment method continue button
		driver.findElement(By.id("paymentmethod_2")).click();
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
		
		//To select the card type
		WebElement card = driver.findElement(By.id("CreditCardType"));
		Select carddropdown=new Select(card);
		carddropdown.selectByVisibleText("Master card");
		
		//To Enter the Card holder name
		driver.findElement(By.id("CardholderName")).sendKeys("Dillikumar S");
		
		//To Enter the card Number
		driver.findElement(By.id("CardNumber")).sendKeys("5334670011723265");
		
		//To select the date
		WebElement month = driver.findElement(By.id("ExpireMonth"));
		Select monthDropdown=new Select(month);
		monthDropdown.selectByVisibleText("10");
		
		//To select the Year
		WebElement year = driver.findElement(By.id("ExpireYear"));
		Select YearDropDown=new Select(year);
		YearDropDown.selectByVisibleText("2025");
		
		//To Enter the Card Code
		driver.findElement(By.id("CardCode")).sendKeys("350");
		
		//To Click on Payment continue
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
		
		//To Click on Confirm continue Button
		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input")).click();
		
		//To click on Order details link
		driver.findElement(By.partialLinkText("Click here for order details.")).click();
		
		//To Download Pdf
		driver.findElement(By.xpath("//div[@class='page-title']//a[.='PDF Invoice']")).click();
		
		//To Click on Log out
		driver.findElement(By.partialLinkText("Log out")).click();
		Thread.sleep(2000);
		
		//To Close the Browser
		driver.quit();
		
	}
}
