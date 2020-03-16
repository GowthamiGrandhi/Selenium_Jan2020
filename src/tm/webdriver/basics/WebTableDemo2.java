package tm.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableDemo2 {

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
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']")).click();
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(3000);
		/*
		boolean bTag = false;
		int Rowcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		if(Rowcount==0) {
			System.out.println("Row count is zeo");
		}
		else
		{
		    for(int i=0; i<=Rowcount; i++) {
			    String actText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			    if(actText.contains("Pending Approval")) {
			    	bTag = true;
			    }
			    else
			    {
			    	bTag = false;
			    	break;
			    }
			    if(bTag)
			    	System.out.println("Pass");
			    else
			    	System.out.println("Fail");
			    }
			    
			    		
		}
			*/
		boolean bTag = true;
		int Rowcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		if(Rowcount==0) {
			System.out.println("Row count is zeo");
		}
		else {
			for(int i=1;i<=Rowcount; i++) {
				String actText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
				if(actText.contains("Pending Aprroval")) {
					bTag = false;
					break;
				}
			}
			if(bTag)
				System.out.println("Pass");
			else
				System.out.println("False");
		}
	}

}
