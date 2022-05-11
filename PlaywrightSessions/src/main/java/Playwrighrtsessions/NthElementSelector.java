package Playwrighrtsessions;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
public class NthElementSelector{
    static Page page;
    public static void main (String[] args){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        
        page=browser.newPage();
        page.navigate("https://www.bigbasket.com/");
        
        // it will capture  the first element of this 
        Locator first_ele =page.locator("div.footer-links li a>> nth=0");
        String firstEle =first_ele.textContent();
        System.out.println(firstEle);
        //it will capture last element of this 
        Locator last_ele= page.locator("div.footer-links li a >> nth=-1");
        String lastEle=last_ele.textContent ();
        System.out.println(lastEle);
    }
}