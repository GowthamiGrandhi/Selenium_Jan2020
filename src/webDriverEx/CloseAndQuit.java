package webDriverEx;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.talentzing.com/TrainingHome.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.linkText("FAQ")).click();
		
		driver.findElement(By.linkText("FeedBack")).click();
		Thread.sleep(3000);
		
		//Get Home Page Window Handle
		String HomepageHandle = driver.getWindowHandle();
		
		//Get Sub browsers Handle
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wndhandle : allhandles) {
			//Move Focus to Sub Browser
			driver.switchTo().window(wndhandle);
			String pageURL = driver.getCurrentUrl();
			
			if(pageURL.contains("FeedBack")) {
				System.out.println("Switched to FeedBack page");
				driver.findElement(By.id("txtfullName")).sendKeys("Testing Masters");
				driver.findElement(By.id("txtemail")).sendKeys("TM1084@gmail.com");
				driver.findElement(By.id("txtmsg")).sendKeys("Test");
				driver.findElement(By.id("btnSubmit")).click();
				
				Thread.sleep(3000);
				driver.close();// will close feedback browser
				break;//exit from the loop
			}
		}
		//Switch to Home Page Browser
		driver.switchTo().window(HomepageHandle);
	
	driver.quit(); // Close all Browsers opened through web driver

	}

}
