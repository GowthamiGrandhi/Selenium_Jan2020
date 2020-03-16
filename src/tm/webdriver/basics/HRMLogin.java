package tm.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMLogin {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/");
		/*
		WebElement un = driver.findElement(By.id("txtUsername"));
		System.out.println("Before: " + un.getAttribute("value"));
		un.clear();
		un.click();
		un.sendKeys("user02");
		System.out.println("After: " + un.getAttribute("value"));
		*/
			//OR
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		//driver.quit();
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		act.moveToElement(leave).build().perform();
		//driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		
		driver.findElement(By.id("applyleave_txtLeaveType")).click();
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[2]")).click();
		//driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[3]")).click();
		//driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[4]")).click();
		
		
		
	}

}
