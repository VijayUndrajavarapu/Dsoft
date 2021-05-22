package Started_prac;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Locators extends Base_May10{
	public static void main(String[] args) throws Exception {
		/*
		 * All these locators are static methods 		/BY Class
		 * 
		 * id() 				driver.findElement(By.id("  "));
		 * name() 
		 * ClassName()
		 * xpath()
		 * CssSelector()
		 * LinkText()
		 * partialLinkText()
		 * tagName()
		 */
		init();
		openBrowser("chromebrowser");
		NavigateURL("demosite");
		
		Map<String, Object> pref = new HashMap<String , Object>();
		pref.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("pref", pref);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		driver.findElement(By.className("form-control")).sendKeys("vija");
		
		
		/*
		 * webDriver methods
		 * 
		 * 1	getCurrentURL() 
		 * 2	getTitle()
		 * 3	getPageSource() 
		 * 4	getWindowHandle() 
		 * 5	getWindowHamdles()
		 * 6	Navigate() 
		 * 7	Manage()
		 * 8	quit()
		 * 9	close()
		 * 10	findElement()
		 * 11	findElements()
		 * 12 	switchTo()
		 * 13	get()
		 * 
		 */
		
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("HRX");
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"desktop-header-cnt\"]//*[@class=\"desktop-navContent\"][1]")).
		 * click();
		 */
		
		
		
		
		
	}
}
