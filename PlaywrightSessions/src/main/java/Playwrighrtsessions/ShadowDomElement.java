package Playwrighrtsessions;

import java.nio.file.AccessDeniedException;

import org.w3c.dom.traversal.NodeIterator;

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
		 
		 //This app has got  Shadow DOM that is why we have to start from Shadow root to locate input element
		 //
		 page.locator("book-app[apptitle='BOOKS'] #input").fill("Testing");
		 String textString=page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
			System.out.println(textString);	 
			
			Page page1=browser.newPage();
			page1.navigate("https://selectorshub.com/xpath-practice-page/");
			//This element is inside the frame first start from iframe then to the shadow and input  
			page1.frameLocator("#pact").locator("div#snacktime #tea").fill("Turkish Tea");  
				 
	 }

}
