package Playwrighrtsessions;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
public class HasElements {
	
	 public static void main(String[] args) {
	
	
	 Playwright playwright = Playwright.create();
	 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	 Page page=browser.newPage();
	 page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
	 
	 // in this locator we are going from selectdropdown to options element locator chain 
	 Locator loc=page. locator("select#Form_submitForm_Country:has(option[value='India'])");
	 loc.allInnerTexts().forEach(e-> System.out.println(e));
	 }

}
