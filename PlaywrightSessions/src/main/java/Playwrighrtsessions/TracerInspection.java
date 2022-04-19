package Playwrighrtsessions;


import java.nio.file.Paths;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Tracing.StartChunkOptions;
import com.microsoft.playwright.Tracing.StartOptions;
import com.microsoft.playwright.Tracing.StopChunkOptions;
import com.microsoft.playwright.Tracing.StopOptions;


	
public class TracerInspection {

	
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      
	      // Start tracing before creating / navigating a page.
	        context.tracing().start(new Tracing.StartOptions()
	       .setScreenshots(true)
	       .setSnapshots(true));

	      // Open new page
	      Page page = context.newPage();

	      // Go to https://academy.naveenautomationlabs.com/
	      page.navigate("https://academy.naveenautomationlabs.com/");

	      // Click text=Store
	      page.click("text=Store");
	      // assert page.url().equals("https://academy.naveenautomationlabs.com/s/store");

	      // Click text=Login
	      page.click("text=Login");

	      // Click text=Log In Email Password Forgot Password? Login Sign Up >> label
	      page.click("text=Log In Email Password Forgot Password? Login Sign Up >> label");

	      // Fill text=Log In Email Password Forgot Password? Login Sign Up >> [placeholder="Email"]
	      page.fill("text=Log In Email Password Forgot Password? Login Sign Up >> [placeholder=\"Email\"]", "denix");

	      // Click :nth-match(:text("Password"), 2)
	      page.click(":nth-match(:text(\"Password\"), 2)");

	      // Fill [placeholder="Password"]
	      page.fill("[placeholder=\"Password\"]", "12344");

	      // Click button:has-text("Sign Up")
	      page.click("button:has-text(\"Sign Up\")");

	      // Click [placeholder="Name"]
	      page.click("[placeholder=\"Name\"]");

	      // Fill [placeholder="Name"]
	      page.fill("[placeholder=\"Name\"]", "deniz");

	      // Click [placeholder="Email"]
	      page.click("[placeholder=\"Email\"]");

	      // Fill [placeholder="Email"]
	      page.fill("[placeholder=\"Email\"]", "den");

	      // Click [placeholder="Create Password"]
	      page.click("[placeholder=\"Create Password\"]");

	      // Fill [placeholder="Create Password"]
	      page.fill("[placeholder=\"Create Password\"]", "123");

	      // Click [placeholder="Mobile"]
	      page.click("[placeholder=\"Mobile\"]");

	      // Click text=+1
	      page.click("text=+1");

	      // Click text=United States
	      page.click("text=United States");

	      // Click #loginFormHtml div [aria-label="Close"]
	      page.click("#loginFormHtml div [aria-label=\"Close\"]");

	      // Click text=Login
	      page.click("text=Login");
	      
	   // Stop tracing and export it into a zip archive.
	      context.tracing().stop(new Tracing.StopOptions()
	       .setPath(Paths.get("trace.zip")));
	      
	      //This code will open trace zip file from cli 
	      //mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="show-trace trace.zip"

	    }
	  }
	}


