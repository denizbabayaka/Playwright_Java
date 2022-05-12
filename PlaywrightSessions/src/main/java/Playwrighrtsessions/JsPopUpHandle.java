package Playwrighrtsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JsPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		// This will listen the page and in case of any pop up it will capture the
		// message at the pop up
		page.onDialog(dialog -> {
			String text = dialog.message();
			System.out.println(text);
			dialog.accept("Hi this is my Alert from Deniz");

			// dialog.dismiss();
		});

		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		// Playwright handles javascript alerts automatically
		page.click("//button[text()='Click for JS Alert']");
		Thread.sleep(1500);
		page.click("//button[text()='Click for JS Confirm']");
		Thread.sleep(1500);
		page.click("//button[text()='Click for JS Prompt']");
		Thread.sleep(1500);

		String result = page.textContent("#result");
		System.out.println(result);

		page.close();
		browser.close();
		playwright.close(); 

	}
}