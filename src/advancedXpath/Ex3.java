package advancedXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> EMPIds = driver.findElements(By.xpath("//table/tbody/tr/td[5][text()='Analyst']/preceeding-sibling::td[3]"));
		int n = EMPIds.size();
		for(int i=0; i<n;i++) {
			
			String id = EMPIds.get(i).getText();
			System.out.println(id);
		}
		//for(WebElement id:EMPIds)
		//System.out.println(id.getText());
		

	}

}
