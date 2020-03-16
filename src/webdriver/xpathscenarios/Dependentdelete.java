package webdriver.xpathscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependentdelete {

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
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//a[text()='Dependents']")).click();
		driver.findElement(By.xpath("//input[@id='btnAddDependent']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("Mani");
		driver.findElement(By.xpath("//select[@id='dependent_relationshipType']/option[2]")).click();
		WebElement date = driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']"));
		date.clear();
		date.click();
		date.sendKeys("1996-02-05");
		date.sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click();
		
		int Rcnt = driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
		System.out.println(Rcnt);
		for(int i=1;i<=Rcnt; i++) {
			String name = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
			
			if(name.contentEquals("Mani"))
				System.out.println("Dependent is added successfully");
			
			else 
				System.out.println("Dependent is not added successfully");
		driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[text()='Mani']")).click();
		//driver.findElement(By.xpath("//input[@id='delDependentBtn']")).click();
   }

	}
}
