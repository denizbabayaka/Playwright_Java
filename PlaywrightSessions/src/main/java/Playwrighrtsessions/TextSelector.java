package Playwrighrtsessions;

import java.nio.file.AccessDeniedException;
import java.util.Iterator;
import java.util.concurrent.atomic.DoubleAdder;

import javax.lang.model.element.NestingKind;

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
		//page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
		page.navigate("https://demo.opencart.com/index.php?route=account/login");
		//page.locator("text=Contact Sales").click();
		//page.locator("text=Privacy Policy").first().click();
		
//		Locator linksLocator=page.locator("text=Privacy Policy");
//		// it will count the locator 
//		System.out.println(linksLocator.count());
//         
//	for (int i = 0; i < linksLocator.count(); i++) {
//		//nth()=> we can capture what we want from each of every element during the loop iteration 
//		String textString=linksLocator.nth(i).textContent();
//		System.out.println(textString);
//		   if (textString.contains("Service Privacy Policy")) {
//			   linksLocator.nth(i).click();
//			   break;
//			
//		}
		
		//after h2 tag we specify the text inside the locator with has-text method
		//String header=page.locator("h2:has-text('New Customer')").textContent();
		
		//it will go from parent to child element 
		String header1=page.locator("div.well h2:has-text('New Customer')").textContent();
		System.out.println(header1);
		
		//if we want to pick up the text inside the element we have to write it into  single qoute 
		String header2=page.locator("'Your Store'").textContent();
		System.out.println(header2);
		
		// start from parent which has got form tag then go to input tag of login  button
		page.locator("form input:has-text('Login')").click();
		
	    
		
		
		
		
		
		
		
		
	}	
		
		
		

		
		

	}

