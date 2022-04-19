package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class BrowserContextConcept {

	public static void main(String[] args) {
		
		Playwright playwright =Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        /*
         * This will give us a browser context and we can open as many browser as we can 
         */
		BrowserContext brc1 = browser.newContext();
		Page p1 = brc1.newPage();
		p1.navigate("https://www.orangehrm.com/orangehrm-30-day-trial");
		// this will pass id selector and name parameter to the fill form 
		p1. fill("#Form_submitForm_Name", "Deniz");
		System.out.println(p1.title());
		
		BrowserContext brc2 = browser.newContext();
		Page p2 = brc2.newPage();
		p2.navigate("https://www.automationpractice.com/");
		// this will pass id selector and name parameter to the fill form 
		p2. fill("#search_query_top", "Deniz");
		System.out.println(p2.title());
		
		p1.close();
		brc1.close();
		
		p2.close();
		brc2.close();
		
		
		
		
	}  

}
