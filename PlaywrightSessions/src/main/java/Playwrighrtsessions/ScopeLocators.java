package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.LocatorOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScopeLocators {
	static Page page;

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
		page.navigate("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		// We capture complete number of rows in entire table
		Locator row = page.locator("table#example tr");
		// Give me the scope of particular text in a row and then locate the clickbox in
		// that row
		// no need to loop inside the table to select a specific row
		row.locator(":scope", new Locator.LocatorOptions().setHasText("Ashton Cox")).locator(".select-checkbox")
				.click();

		// Get all text of the entire rows and with lambda print them down
		row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));

	}
}
