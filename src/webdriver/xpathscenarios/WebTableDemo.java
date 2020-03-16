package webdriver.xpathscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act.moveToElement(leave).build().perform();
		
		driver.findElement(By.xpath("//a[text()='My Leave']")).click();
		Thread.sleep(5000);//taken this as example for synchronization
		String CellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[4]")).getText();
		System.out.println("Cell Text is: " +CellText);
		/*
		int rowcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		Thread.sleep(3000);
		System.out.println("Row count is: " +rowcount);
		
		int colcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td")).size();
		System.out.println("Col count is: " +colcount );
		
		String CellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[5]")).getText();
		System.out.println("Cell Text is: " +CellText);
	*/

	}

}
