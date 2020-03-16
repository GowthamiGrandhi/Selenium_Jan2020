package testNGDemo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex3 {
	
	@BeforeSuite
	public void BS() {
		System.out.println("BS executed");		
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("BT executed");		
	}
	
	@Test
	public void TC03() {
		System.out.println("TC03 executed");		
	}
	
	@Test
	public void TC04() {
		System.out.println("TC04 executed");		
	}

}
