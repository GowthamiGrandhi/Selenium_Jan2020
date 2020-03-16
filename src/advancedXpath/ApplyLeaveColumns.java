package advancedXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ApplyLeaveColumns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		//driver.quit();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act.moveToElement(leave).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		WebElement leaveType = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']"));
		Select sel_LeaveType = new Select(leaveType);
		sel_LeaveType.selectByVisibleText("Annual Leave");
		
		WebElement frmDate = driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
		frmDate.clear();
		frmDate.click();
		frmDate.sendKeys("2020-08-23");
		frmDate.sendKeys(Keys.ESCAPE);
		
		WebElement toDate = driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
		toDate.clear();
		toDate.click();
		toDate.sendKeys("2020-08-24");
		frmDate.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath(("//textarea[@id='applyleave_txtComment']"))).sendKeys("Going to marriage");
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
				

	}

}
