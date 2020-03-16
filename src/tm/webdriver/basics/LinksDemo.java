package tm.webdriver.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int n = links.size();
		System.out.println("Links present in FB page: " +n);
		/*
		for(WebElement link : links) {
			String st = link.getText();
			System.out.println(st);
		}
		*/
		for(int i=0; i<=n; i++) {
			String st = links.get(i).getText();
			System.out.println(st);
		}
			
}
}