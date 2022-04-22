package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class CommaSelector {

	
		 public static void main(String [] args) {
			 Playwright playwright = Playwright.create();
			 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			 //text locators
			 Page page = browser.newPage();
			 page.navigate("https://academy.naveenautomationlabs.com");
			 
			 // in case of any change inside the element text we can use different locators
			 //with separating them by comma 
			 
			 page.locator("span:has-text('Store'), span: has-text('LogIn'), span:has-text('Login'), span:has-text('Signin'),span:has-text('signin,)").click();

			
			 
		 }


	}


