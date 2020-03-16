package tm.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceDemo {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.nopcommerce.com/register/");
		 driver.findElement(By.id("gender-male")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("venky");
		 driver.findElement(By.id("LastName")).sendKeys("Grandhi");
		 
		//select day from drop down
	     Select sel_day = new Select(driver.findElement(By.name("DateOfBirthDay")));
	     sel_day.selectByVisibleText("20");
	     
	     //select month from drop down
	     Select sel_month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
	     sel_month.selectByVisibleText("May");
	     
	     //select year from drop down
	     Select sel_year = new Select(driver.findElement(By.name("DateOfBirthYear")));
	     sel_year.selectByVisibleText("1998");
	     
	     driver.findElement(By.id("Email")).sendKeys("sxs_12@yahoo.co.in");
	     driver.findElement(By.id("Company")).sendKeys("DBS");
	     // have doubt
	     //driver.findElement(By.id("Newsletter")).click();
	     driver.findElement(By.id("Password")).sendKeys("TM1234");
	     driver.findElement(By.id("ConfirmPassword")).sendKeys("TM1234");
	     driver.findElement(By.id("register-button")).click();
	     
	}
}
