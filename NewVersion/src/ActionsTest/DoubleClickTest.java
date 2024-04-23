					package ActionsTest;
					
					import org.openqa.selenium.By;
					import org.openqa.selenium.WebDriver;
					import org.openqa.selenium.WebElement;
					import org.openqa.selenium.chrome.ChromeDriver;
					import org.openqa.selenium.interactions.Actions;
					
					public class DoubleClickTest {
						public static void main(String[] args) throws InterruptedException {
							
							
							//launch the browser
							WebDriver driver=new ChromeDriver();
							
							//maximize the browser
							driver.manage().window().maximize();
							
							//to get the url
							driver.get("https://demoapps.qspiders.com/");
							Thread.sleep(2000);
							
							//to click on ui testing concept
							driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
							Thread.sleep(2000);
							
							//to click on button text 
							driver.findElement(By.xpath(" //section[.='Button']")).click();
							Thread.sleep(2000);
							
							//to click on double click button
							driver.findElement(By.partialLinkText("Double Click")).click();
							Thread.sleep(2000);
							
							// to click on yes button
							WebElement doubleclickbtn = driver.findElement(By.id("btn20"));
							Thread.sleep(2000);
							
							Actions action=new Actions(driver);
							
							action.doubleClick(doubleclickbtn).perform();
							
							//To get text of double click
							String actualres = driver.findElement(By.xpath("//button[@id='btn20']/following-sibling::span")).getText();
							Thread.sleep(3000);
							
							//The Excepted Result
							String Exceptedres="You selected \"Yes\"";
					
					
							
							//To Validate Test case
							if(actualres.equals(Exceptedres)) {
								System.out.println("Test case pass");
							}
							else {
								System.out.println("Test Case Fail");
							}
							
							//To Close the Browser
							driver.quit();
							
							
							
							
						}
					}
