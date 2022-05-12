package Playwrighrtsessions;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class FileUploadHandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");
		//This will go and load a custom file with its content
		page.setInputFiles ("input[name='upfile']", new FilePayload ("naveen.text",
		        "text/plain",
		        "this is Deniz here".getBytes (StandardCharsets.UTF_8)));
		page.click("input[value='Press']");


	}

}
