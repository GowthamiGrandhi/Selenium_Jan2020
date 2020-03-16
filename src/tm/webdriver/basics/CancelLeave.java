package tm.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelLeave {

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
		boolean bTag=false;
		String leaveDate = "2020-03-20";
		int Rcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		int iRow = 0;
		for(int i=1; i<=Rcount; i++) {
			String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if ( (appDate.equals(leaveDate)) && (appStatus.contains("Pending Approval"))) {
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select/option[text()='Cancel']")).click();
				driver.findElement(By.xpath("//input[@id='btnSave']")).click();
				bTag = true;
				iRow = i;
				break;
			}
		}
		if(bTag && iRow!=0) {
			System.out.println("Cancelled selected successfully and clicked on save");
			String updatedStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]")).getText();
			if(updatedStatus.contains("Cancelled"))
				System.out.println("Status changed to cancelled, pass");
			else
				System.out.println("Status not changed to cancelled, fail");
		}
		else
			System.out.println(leaveDate + "-with pending approval status not found or there is no data in table");
		
		}
		

	}


