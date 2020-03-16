package testNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo {
	
	@Test
	public void TC01() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		//Assert.assertEquals(actTitle, expTitle, "Google page not displayed");
		Assert.assertTrue(actTitle.equals(expTitle));
		Assert.assertFalse(actTitle.equals(expTitle));
		
		driver.quit();
		System.out.println("TC01 execution completed");
	}
	@Test
	public void TC02() {
		/*
		System.out.println("softAssert method was Started");
		Assert.assertTrue(false);
		System.out.println("softAssert method was executed");
		*/
		System.out.println("TC02 execution completed");
	}

	public static void main(String[] args) {
		

	}

}
