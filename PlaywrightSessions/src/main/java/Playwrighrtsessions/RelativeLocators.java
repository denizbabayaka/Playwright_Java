package Playwrighrtsessions;



import java.nio.file.AccessDeniedException;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame.NavigateOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativeLocators {

static Page page;
	
	public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
       
        //text locators
        page =browser.newPage();
       page.navigate("https://selectorshub.com/xpath-practice-page/");
       
       // this method gives us the element which is left of other element
       //and gives the first one 
       //page.locator("input[type='checkbox']:left-of(:text('Joe.Root'))").first().click();
       
       selectUser("Joe.Root");
       selectUser("Jasmine.Morgan");
       
       System.out.println(getUserRole("Joe.Root"));
       System.out.println(getAboveUser("Joe.Root"));
       System.out.println(getBelowUser("Joe.Root"));
       
       // This will give all the elements texts near Joe.Root
       Locator nearElements = page. locator("td:near(:text('Joe.Root'),400)");
       List<String> nearEleText = nearElements.allInnerTexts();
       for (String e: nearEleText) {
       System.out.println(e);
       }
       
       // it will give the right  element of  Joe.Root
//       String userRole=page.locator("td:right-of(:text('Joe.Root'))").first().textContent();
//       System.out.println(userRole);
      
       
       	}
	/*
	 * we create a dynamic method in order to click the element of given name 
	 */
	 public static void selectUser(String userName) {
	 page.locator("input[type='checkbox']:left-of(:text('"+userName+"'))").first().click();
	
	
}
	 // this method will return the text of the element on the right of given userName  
	 public static String getUserRole(String userName) {
		 return page.locator("td:right-of(:text('"+userName+"'))").first().textContent();
		 
	 }
	 // it will give element located above of userName 
	 public static String getAboveUser(String userName) {
		 return page.locator("a:above(:text('"+userName+"'))").first().textContent();
	 }
    
	 // it will give element located above of userName 
	 public static String getBelowUser(String userName) {
		 return page.locator("a:below(:text('"+userName+"'))").first().textContent();
	 } 
	 
}


