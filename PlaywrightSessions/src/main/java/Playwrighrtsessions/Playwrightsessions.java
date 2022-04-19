package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Playwrightsessions {

	public static void main(String[] args) {
        /*
         * This method will return implementation of playwright and create a server
         */
		Playwright playwright = Playwright.create();
		
		// This will return the browser instance 
		//Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		// page is like webdriver it will function as an instance of browser
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		//lp.setChannel("firefox"); if we want to run un it we have to write firefox to line 25
		//lp.setChannel("msedge");
		lp.setHeadless(false);
		Browser browser = playwright.chromium().launch(lp);
		
		Page page = browser.newPage();
		page.navigate("https:www.amazon.com");

		String title = page.title();
		System.out.println("Page title is :" + title);

		String url = page.url();
		System.out.println("url is :" + url);
		

		browser.close();
		playwright.close();

	}

}
// mvn code for chromium runner and playwright inspector from cli (the record and code generator tool)
//mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="codegen https://academy.naveenautomationlabs.com/"
