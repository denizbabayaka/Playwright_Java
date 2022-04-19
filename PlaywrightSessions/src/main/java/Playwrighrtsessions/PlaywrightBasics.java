package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
		
		//we have to start playwright server create method will return implementation of playwright
		Playwright playwright =Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser =playwright.chromium().launch(lp); 
		
		//This will give you the option which browser you would launch 
		//Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		
		Page page =browser.newPage();
		page.navigate("https://www.amazon.com");
		String title =page.title();
		System.out.println("page title is: "+title);
		
		String url =page.url();
		System.out.println("url is: "+ url);
		
		browser.close();
		playwright.close();
		
		
	
		

	}

}
