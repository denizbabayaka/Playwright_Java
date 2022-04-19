package Playwrighrtsessions;



import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {
	
	public static void main (String [] args) {
	    Playwright playwright = Playwright.create();
	    Browser browser = playwright.chromium().launch (new BrowserType.LaunchOptions().setHeadless (false));
        
	    
	    //locators
	    
	    BrowserContext browserContext = browser.newContext(); 
	    Page page = browserContext.newPage();
	    
	    page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    //page.navigate("https://academy.naveenautomationlabs.com/");

	    
	    //This is a method of creating custom lacator this feature not exist in Selenium 
	    // we capture the original text which is written on the element in UI
	    
	    //single element:
//	    Locator contactSales = page.locator("text =CONTACT SALES");
//	    contactSales.hover();
//	    contactSales.click();
	    
	    /*
	     * This will give Error because there more than one  Login element so we 
	     * have to write first() method to find Login button  at Login page 
	     */
	    // single element 
//	    Locator loginBtn = page.locator("text = Login");
//	    int totalLogins = loginBtn.count();
//	    // it will give us the total number of elements with Login attiribute 
//	    System.out.println(totalLogins);
	    // if we want to click first element of the list of elements we have to write first();
//	    loginBtn.first().click();
	    
	    //this locator returns multiple elements   before id we write tag name (selector) 
	    Locator countryOptions =page.locator("select#Form_submitForm_Country option");
	    System.out.println(countryOptions.count());
	    
	    //This method will iterate all the country options and assign the context to the text variable 
//	    for (int i = 0; i < countryOptions.count(); i++) {
//	    	String text =countryOptions.nth(i).textContent();
//	    	System.out.println(text);
//	    
//	    	
//		}
	    
	    //This option will bring the countryoptions as List
	    List<String> optionsTextList = countryOptions.allTextContents ();
//	    for(String e: optionsTextList) {
//	        System.out.println(e);
//	    }
	   
	    //This is Lambda with foreach we will get all the values to ele var and print
	    optionsTextList.forEach(ele -> System.out.println(ele));

	    
	    


	              

	    
	    
	    
	  
	    
	    
	    
}
	
}
