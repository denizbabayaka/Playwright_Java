package Playwrighrtsessions;

import java.nio.file.AccessDeniedException;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser.NewContextOptions;


public class FrameHandle {

	public static void main(String[] args) {
		
		 Playwright playwright = Playwright.create();
		 Browser browser=
				 playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless (false));

		 
		 Page page = browser.newPage();
		 page.navigate("http://londonfreelance.org/courses/frames/index.html");
		 
		 // this method handles with the frames we find the locator of frame 
		 // there is chain locator method we are going from parent to child and get the text 
		 String header=page.frameLocator("frame[name='main']").locator("h2").textContent();
		 System.out.println(header);
		 
		 String header1=page.frame("main"). locator("h2").textContent();
         System.out.println(header1);
         
         /*
          * NEW TEST
          */
         
        //Here we are creating a new instance of browser so we can make parallel testing 
         Page page1 = browser.newPage();
         page1.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration");
         
         // inputs of this frame enables only before clicking to it 
         page1.locator("img[title='vehicle-registration-forms-and-templates']").click();

         // we are using an xpath
         page1.frameLocator("//iframe[contains (@id, 'frame-one')]")
         //in Playwright we use fill instead of type 
                         .locator("#RESULT_TextField-8").fill("Naveen Automation");
        
         


         
         
         
         
         

		

	}

}
