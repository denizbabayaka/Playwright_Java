package Playwrighrtsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NewAuth {
	
	
	 public static void main(String[]args){
	    	
	    	
			Playwright playwright=Playwright.create();
			Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
		    //when we start the browser it will take login session from applogin.json
			//so  no need to give login credentials everything already in json file 
			BrowserContext brContext=
					browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
			
			Page page=brContext.newPage();
			page.navigate("http://automationpractice.com/");
			

}
}