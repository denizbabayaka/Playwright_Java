package Playwrighrtsessions;

import com.microsoft.playwright. Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDomElement {
	
	
	 public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		 Browser browser = playwright.chromium().launch (new BrowserType. LaunchOptions().setHeadless (false));
		 
		 
		 // Page -- DOM-Shadow DOM --elements
		 
		 // Page -- DOM-- iFrame--Shadow DOM --elements
		 
		 Page page =browser.newPage();
		 page.navigate("https://books-pwakit.appspot.com/"); 
		 page.locator("book-app[apptitle='BOOKS'] #input").fill("Testing");
				 
				 
	 }

}
