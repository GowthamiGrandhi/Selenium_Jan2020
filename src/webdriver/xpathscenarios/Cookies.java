package webdriver.xpathscenarios;

import java.util.Set;

import okhttp3.Cookie;

public class Cookies {
	
	//open the facebook page
	//Delete all cookies
	driver.manage().deleteAllCookies();
	//Display all cookies
	Set<Cookie> cookiesList = driver.manage().getCookies();
	
	for(Cookie c : cookiesList) {
		System.out.println(c);
	}

}
