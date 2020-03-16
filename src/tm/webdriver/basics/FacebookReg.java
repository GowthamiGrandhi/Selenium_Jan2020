package tm.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {
	
 public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.name("firstname")).sendKeys("DevelopYou");
	 driver.findElement(By.name("lastname")).sendKeys("Technologies");
     driver.findElement(By.name("reg_email__")).sendKeys("9989786780");
     driver.findElement(By.name("reg_passwd__")).sendKeys("TM1234");
     
     //select day from drop down
     Select sel_day = new Select(driver.findElement(By.id("day")));
     sel_day.selectByVisibleText("20");
     
     //select month from drop down
     Select sel_month = new Select(driver.findElement(By.id("month")));
     sel_month.selectByVisibleText("May");
     
     //select year from drop down
     Select sel_year = new Select(driver.findElement(By.id("year")));
     sel_year.selectByVisibleText("1998");
     
     //select Gender radio button
     driver.findElement(By.id("u_0_6")).click();
     driver.findElement(By.name("websubmit")).click();
     
 }	

	}


