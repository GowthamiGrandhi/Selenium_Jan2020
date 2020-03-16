package advancedXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {

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
		String txt = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]/a[text()='2020-02-28']/parent::td/following-sibling::td[6]")).getText();
		System.out.println("Text is: " + txt);
	

	}

}
