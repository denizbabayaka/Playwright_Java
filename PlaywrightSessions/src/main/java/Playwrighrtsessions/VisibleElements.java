package Playwrighrtsessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElements {
	
	 public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		 Browser browser = playwright.chromium().launch (new BrowserType. LaunchOptions().setHeadless (false));
		 Page page =browser.newPage();
		 
		 //button:visible
		 //button >> visible=true 
		 //text=Login >> visible=true
		 
//		 page.navigate("http://127.0.0.1:5500/main/index.html");
//		 String text=page.locator("button: visible").textContent();
//		 //page. locator("button >> visible=true").textContent();
//		 System.out.println(text);
//		 
		 page.navigate("https://www.amazon.com/");
		 
		 // it will give all visible pages with a locator and store in List 
		 List<String>linkTextList= page.locator("a:visible").allInnerTexts();
		 
		 for (int i = 0; i < linkTextList.size(); i++) {
			 
			System.out.println(linkTextList.get(i));
		}
	     
		 // This will give all the visible elements which stars img tag
		 int textList=page.locator("xpath=//img >> visible=true").count();
		 
		 
			System.out.println(textList);
		
				 
				
	 
	 
	 }

}
