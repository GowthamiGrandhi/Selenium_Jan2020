package mini_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserLirary extends WebLibrary {
	
	public static WebDriver driver;
	
	public static void LoginHRM(String UserID, String Password) throws InterruptedException {
		boolean status;
		status = launchApp();
		Thread.sleep(3000);
		if(status)
			System.out.println("Browser launched");
		else
			System.out.println("Browser not launched");
		status = setValue("//input[@id='txtUsername']", "UserID");
		if(status)
			System.out.println("User name entered");
		else
			System.out.println("User name not entered");
		
		status = setValue("//input[@id='txtPassword']", "Password");
		if(status)
			System.out.println("Password entered");
		else
			System.out.println("Password not entered");
		
		status = clickElement("//input[@id='btnLogin']");
		if(status)
			System.out.println("Login button Clicked");
		else
			System.out.println("Login button not Clicked");
	}
//==========================================================================================	
    public static void navApplyLeave() throws InterruptedException {
    	boolean status;
    	status = selectMenuItem("//a[@id='menu_leave_viewLeaveModule']", "//a[text()='Apply']");
    	if(status)
    		System.out.println("Apply leave page displayed");
    	else
    		System.out.println("Apply leave page displayed");    		
	}
    
    public static void navMyLeave() throws InterruptedException {
    	boolean status;
    	status = selectMenuItem("//a[@id='menu_leave_viewLeaveModule']", "//a[text()='My Leave']");
    	if(status)
    		System.out.println("My leave page displayed");
    	else
    		System.out.println("My leave page displayed");    		

	}
	
    public static void LogoutHRM() throws InterruptedException {
    	//System.out.println("LogoutHRM executed");
    	Actions act = new Actions(driver);
    	WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
    	act.moveToElement(welcome).click().build().perform();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    	driver.quit();
	}

}
