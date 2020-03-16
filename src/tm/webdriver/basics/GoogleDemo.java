/*
package tm.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {
	
	WebDriver driver;
	StringBrowsername = "chrome";
	void launchGooglePage() {
		
		switch(Browsername.toUpperCase()) {
		case "CHROME" :
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FIREFOX" :
			System.setProperty("webdriver.firefox.driver", "D:\\Geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE" :
			//System.setProperty("webdriver.firefox.driver", "D:\\Geckodriver.exe");
			//driver = new FirefoxDriver();
			//break;
		default :
			System.out.println("Incorrect browser name entered");
		}
		driver.get("https://www.google.com/");
	}
	void verifyTitle() {
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle))
			System.out.println("Google page displayed");
		else
			System.out.println("Google page not displayed");
	}
	void searchText() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/