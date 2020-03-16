package advancedXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaginationEx {

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
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		//top next arrow
		//driver.findElement(By.xpath("//ul[@class='paging top']/li/a")).click();
		//bottom next arrow
		List<WebElement> arrow= driver.findElements(By.xpath("//ul[@class='paging bottom']/li/a"));
		int n = arrow.size();
		System.out.println(arrow.size());
		if(n>0)
			
		int iRow = 0;
		for (int i=0; i<=n; i++) {
		
			String AppStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if(AppStatus.contains("Pending Approval"))
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select/option[text()='Cancel']")).click();
			    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			    iRow = i;
		
		}
		
		
		
	}

}
