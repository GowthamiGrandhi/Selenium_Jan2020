package webdriver.xpathscenarios;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreensEx1 {
	
				
		private TakesScreenshot driver;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File trgFile = new File("D:\\screenshot.png");
		FileHandler.copy(scrFile, trgFile);
		//FileUtils.copyFile(scrFile, trgFile);
	

}
