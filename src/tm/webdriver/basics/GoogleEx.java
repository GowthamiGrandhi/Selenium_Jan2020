package tm.webdriver.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle))
			System.out.println("Google page displayed");
		else
			System.out.println("Google page not displayed");

	}
}
