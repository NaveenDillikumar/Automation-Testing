package Testngtest;

import org.testng.annotations.Test;

public class DisableScripts {

	@Test(groups = "Smoke")
	public void test1() throws InterruptedException{
		System.out.println("Test 1");
		Thread.sleep(1000);
	}
	
	@Test(groups = "Function")
	public void test2() throws InterruptedException {
		System.out.println("Test 2");
		Thread.sleep(2000);
	}
	
	@Test(groups = "Intergration")
	public void test3() throws InterruptedException {
		System.out.println("Test 3");
		Thread.sleep(1000);
	}
}
