package Playwrighrtsessions;

import java.util.concurrent.CountDownLatch;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CommaSelector {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		// text locators
		Page page = browser.newPage();
		page.navigate("https://academy.naveenautomationlabs.com");

		// in case of any change inside the element text we can use different locators
		// with separating them by comma

		// page.locator("a:has-text('Login'), a:has-text('LogIn'), a:has-text('Login'),
		// span:has-text('Signin'),span:has-text('signin,)").click();
        
		//validate important elements inside DOM 
		Locator imp_ele = 
				page.locator("span:has-text('Store'),"
						+ " " + "span:has-text('signin'),"
						+ " a:has-text('EXPLORE COURSES')");

		System.out.println(imp_ele.count());

		if (imp_ele.count() == 3) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");

		}

	}
}
