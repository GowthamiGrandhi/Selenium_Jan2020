package mini_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebLibrary {
	
	public static WebDriver driver;
	//================================================================================
	public static boolean launchApp() {
		boolean bStatus = true;
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=================================================================================
	public static boolean setValue(String elexpath, String value) {
		boolean bStatus = true;
		try {
			driver.findElement(By.xpath(elexpath)).sendKeys(value);
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
		public static boolean clickElement(String elexpath) {
			boolean bStatus = true;
			try {
				driver.findElement(By.xpath(elexpath)).click();
			}
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
		}
//=======================================================================================
		public static boolean selectItemByText(String elexpath, String item) {
			boolean bStatus = true;
			try {
				WebElement dropdown = driver.findElement(By.xpath(elexpath));
				Select obj = new Select(dropdown);
				obj.selectByVisibleText(item);
				}
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
		}
//========================================================================================
		public static boolean selectValueEscape(String elexpath, String value) {
			boolean bStatus = true;
			try {
				WebElement editbox = driver.findElement(By.xpath(elexpath));
				editbox.clear();
				editbox.click();
				editbox.sendKeys(value);
				editbox.sendKeys(Keys.ESCAPE);
				
			}
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
			
		}
//=========================================================================================
			public static boolean verifyEditboxValue(String elexpath, String value) {
				boolean bStatus = true;
				try {
					String actValue = driver.findElement(By.xpath(elexpath)).getAttribute("value");
					if(!(actValue.equals(value))) {
						bStatus = false;
					}
				}
					catch(Exception e) {
					bStatus = false;
				}
				return bStatus; 
		}
//==================================================================================================
			public static boolean verifyText(String elexpath) {
				boolean bStatus = true;
				try {
					driver.findElement(By.xpath(elexpath));
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
//========================================================================================================
			public static boolean mouseHover(String elexpath) {
				boolean bStatus = true;
				try {
					Actions act = new Actions(driver);
					WebElement element = driver.findElement(By.xpath(elexpath));
					act.moveToElement(element).build().perform();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
//=========================================================================================================
			public static boolean selectMenuItem(String elexpath1, String elexpath2) {
				boolean bStatus = true;
				try {
					Actions act = new Actions(driver);
					WebElement element = driver.findElement(By.xpath(elexpath1));
					act.moveToElement(element).build().perform();
					driver.findElement(By.xpath(elexpath2)).click();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
//=========================================================================================================
			public static boolean isSelected(String elexpath) {
				boolean bStatus = true;
				try {
					driver.findElement(By.xpath(elexpath)).isSelected();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
				
//==========================================================================================
			public static boolean isDisplayed(String elexpath) {
				boolean bStatus = true;
				try {
					driver.findElement(By.xpath(elexpath)).isDisplayed();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
//==========================================================================================
			public static boolean isEnabled(String elexpath) {
				boolean bStatus = true;
				try {
					driver.findElement(By.xpath(elexpath)).isEnabled();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
//==========================================================================================
			public static boolean rowCount(String elexpath) {
				boolean bStatus = true;
				try {
					driver.findElement(By.xpath(elexpath)).getSize();
				}
				catch(Exception e) {
					bStatus = false;
				}
				return bStatus;
			}
			
}

