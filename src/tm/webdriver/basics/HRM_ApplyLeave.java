package tm.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HRM_ApplyLeave {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		Thread.sleep(3000);
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		WebElement leaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select sel_LeaveType = new Select(leaveType);
		sel_LeaveType.selectByVisibleText("Annual Leave");
		//date picker
		driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='Mar']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2020']")).click();
		driver.findElement(By.xpath("//a[text()='8']")).click();
		
		/*		
		WebElement frmDate = driver.findElement(By.id("applyleave_txtFromDate"));
		frmDate.clear();
		frmDate.click();
		frmDate.sendKeys("2020-02-23");
		frmDate.sendKeys(Keys.ESCAPE);
		*/
		WebElement toDate = driver.findElement(By.id("applyleave_txtToDate"));
		toDate.clear();
		toDate.click();
		toDate.sendKeys("2020-03-08");
		toDate.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.id("applyleave_txtComment")).sendKeys("Going to Home Town");
		driver.findElement(By.id("applyBtn")).click();
				
				
		
		
		

}
}