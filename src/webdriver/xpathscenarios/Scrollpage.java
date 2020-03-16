package webdriver.xpathscenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) {
		// To scroll a page
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		//0 represents from bottom line left to right and 2000 pixels from right top to down

	}

}
