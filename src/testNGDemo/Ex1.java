package testNGDemo;

import org.testng.annotations.Test;

public class Ex1 {
	@Test(priority=3, enabled=false)
	public void TC05() {
		System.out.println("TC05 executed");		
	}
	@Test(priority=1)
    public void TC06() {
    	System.out.println("TC06 executed");		
	}
    @Test(priority=2)
    public void TC07() {
    	System.out.println("TC07 executed");
	}



}
