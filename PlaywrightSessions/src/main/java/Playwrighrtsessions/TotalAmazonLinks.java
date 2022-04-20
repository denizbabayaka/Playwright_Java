package Playwrighrtsessions;

import java.util.List;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright. Page;
import com.microsoft.playwright.Playwright;



public class TotalAmazonLinks {
	
	 public static void main(String[] args) {
	
	 Playwright playwright = Playwright.create();
	 Browser browser = playwright.chromium().launch(new BrowserType. LaunchOptions().setHeadless (false));
	 Page page =browser.newPage();
	 page.navigate("https://www.amazon.com/");
	 List<String> amazonLinks = page.locator ("a:has-text('Amazon')").allInnerTexts();
	 amazonLinks.stream().forEach(e-> System.out.println(e));
	 
	 //xpath going parent to child=> > playwright.$("//a [@class='action-button']/span")
	 //css going parent select dropdown to option => playwright.$("select#Form_submitForm_Country: has (option [value='India'])")
	 

}
}
