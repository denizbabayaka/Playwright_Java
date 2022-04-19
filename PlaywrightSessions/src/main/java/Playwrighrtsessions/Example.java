package Playwrighrtsessions;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();

      // Open new page
      Page page = context.newPage();

      // Go to https://academy.naveenautomationlabs.com/
      page.navigate("https://academy.naveenautomationlabs.com/");

      // Click text=Login
      page.click("text=Login");

      // Click button:has-text("Sign Up")
      page.click("button:has-text(\"Sign Up\")");
      
      page.pause();

      // Click [placeholder="Name"]
      page.click("[placeholder=\"Name\"]");

      // Fill [placeholder="Name"]
      page.fill("[placeholder=\"Name\"]", "deniz");

      // Click [placeholder="Email"]
      page.click("[placeholder=\"Email\"]");

      // Fill [placeholder="Email"]
      page.fill("[placeholder=\"Email\"]", "deniz@gmail.com");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "12345");

      // Click [placeholder="Mobile"]
      page.click("[placeholder=\"Mobile\"]");

      // Fill [placeholder="Mobile"]
      page.fill("[placeholder=\"Mobile\"]", "4567895643");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click text=Create New Account
      page.click("text=Create New Account");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "1234L");

      // Click text=Create New Account
      page.click("text=Create New Account");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "1234La");

      // Click text=Create New Account
      page.click("text=Create New Account");

      // Click #loginFormHtml div [aria-label="Close"]
      page.click("#loginFormHtml div [aria-label=\"Close\"]");
    }
  }
}
