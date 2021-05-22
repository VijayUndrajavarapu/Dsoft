package Started_prac;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notfication_browsng_files{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\vijay\\chromedriver_win32\\chromedriver.exe");

		Map<String, Object> pref = new HashMap<String , Object>();
		// Add key and value to map as follow to switch off browser notification
		
		pref.put("profile.default_content_setting_values.notifications", 2);
		// Pass the argument 1 to allow and 2 to block 
		
		ChromeOptions options = new ChromeOptions();
		//Create instance of ChromeOptions
		
		options.setExperimentalOption("pref", pref);
		//set Experimental option - pref
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/shop/men");
	}

}




/*
 *
 * ProfilesIni p = new ProfilesIni(); FirefoxProfile profile =
 * p.getProfile("JanuaryFFProfile");
 * profile.setPreference("dom.webnotifications.enabled", false);
 * 
 * FirefoxOptions option = new FirefoxOptions(); option.setProfile(profile);
 * driver = new FirefoxDriver(option);
 */