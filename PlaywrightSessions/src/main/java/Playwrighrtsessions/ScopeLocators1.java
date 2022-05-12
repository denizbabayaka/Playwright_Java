package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.LocatorOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScopeLocators1 {
	static Page page;

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();

		page.navigate("https://www.primefaces.org/primeng/table");

		// capture all rows inside the table
		Locator row = page.locator("table#pr_id_2-table tr");
		// click specific checkbox inside the row by chaning locator method
		row.locator(":scope", new Locator.LocatorOptions().setHasText("James Butt")).locator(".p-checkbox-box").click();
		row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));

	}
}