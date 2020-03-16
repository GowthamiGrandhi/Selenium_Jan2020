package webDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/");
		WebElement element = driver.findElement(By.id("txtUsername"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=1; i<=3; i++) {
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid black;')", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'border:; ')", element);
	}

	}

}
