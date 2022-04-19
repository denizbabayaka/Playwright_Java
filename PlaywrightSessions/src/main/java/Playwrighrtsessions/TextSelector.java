package Playwrighrtsessions;

import java.util.Iterator;

import com.microsoft.playwright. Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright. Page;
import com.microsoft.playwright.Playwright;


public class TextSelector {

	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions (). setHeadless(false));
		
		//text locators
		Page page = browser.newPage();
		page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
		page.locator("text=Contact Sales").click();
		page.locator("text=Privacy Policy").first().click();
		
		Locator linksLocator=page.locator("text=Privacy Policy");
		// it will count the locator 
		System.out.println(linksLocator.count());
         
	for (int i = 0; i < linksLocator.count(); i++) {
		//nth()=> we can capture what we want from each of every element during the loop iteration 
		String textString=linksLocator.nth(i).textContent();
		System.out.println(textString);
		
		
		
		
		
		
		
		
	}	
		
		
		

		
		

	}

}
