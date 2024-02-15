package Captcha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1Test {

 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/captcha?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
	driver.quit();
}
}
