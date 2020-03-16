package testNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2 {
	
	@BeforeClass
	public void BC() {
		System.out.println("BC executed");		
	}	

	@BeforeMethod
	public void BM() {
		System.out.println("BM executed");		
	}
	
	@Test
	    public void TC02() {
	    	System.out.println("TC02 executed");		
		}
	
	@Test
	    public void TC01() {
	    	System.out.println("TC01 executed");
		}
	    
		@AfterMethod
		public void AM() {
			System.out.println("AM executed");		
		}

	}
