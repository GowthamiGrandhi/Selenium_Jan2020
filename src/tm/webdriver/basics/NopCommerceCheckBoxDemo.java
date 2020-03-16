package tm.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceCheckBoxDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Gowthami");
		driver.findElement(By.id("LastName")).sendKeys("G");
		Select sel_Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		sel_Day.selectByVisibleText("5");
		
		Select sel_Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		sel_Month.selectByVisibleText("February");
		
		Select sel_Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		sel_Year.selectByValue("1988");
		
		
		String st1 = new String("gowthami.05a1@gmail.com");
		driver.findElement(By.id("Email")).sendKeys(st1);
		driver.findElement(By.id("Company")).sendKeys("DBS");
		WebElement chkbox = driver.findElement(By.id("Newsletter"));
		
		if(chkbox.isDisplayed())
			System.out.println("NewsLetter checkbox is displayed");
		else
			System.out.println("NewsLetter checkbox is not displayed");
		
		if(chkbox.isEnabled())
			System.out.println("NewsLetter checkbox is enabled");
		else
			System.out.println("NewsLetter checkbox is not enabled");
		
		if(chkbox.isSelected())
			System.out.println("NewsLetter checkbox is selected");
		else
			System.out.println("NewsLetter checkbox is not selected");
		
		String st2 = new String("Passw0rd1");
		driver.findElement(By.id("Password")).sendKeys(st2);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(st2);
		driver.findElement(By.id("register-button")).click();
	
		}

}
