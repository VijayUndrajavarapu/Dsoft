package Started_prac;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_May10 {

	public static ChromeDriver driver;
	public static Properties DataProp;
	public static FileInputStream fis;
	public static Properties EnivProp;
	public static String projectPath = "C:\\Users\\lenovo\\git\\Dsoft\\May_03";
	public static Properties ChildProp;
	public static Properties OrProp;
	
	public static void openBrowser(String browser) {	
		if(DataProp.getProperty(browser).equals("chrome")) { //Key base value 
			System.setProperty("webdriver.chrome.driver","D:\\New folder\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			/*
			 * Map<String, Object> pref = new HashMap<String , Object>();
			 * pref.put("profile.default_content_setting_values.notifications", 2);
			 * ChromeOptions options = new ChromeOptions();
			 * options.setExperimentalOption("pref", pref);
			 */
			
			
			driver = new ChromeDriver();
			
		}else {
			//driver =new FirefoxDriver();
			
		}
	}
	
	public static void init() throws Exception{
		fis = new FileInputStream("C:\\Users\\lenovo\\git\\Dsoft\\May_03\\data.properties" ); 
		DataProp = new Properties();
		DataProp.load(fis);
		
		fis = new FileInputStream(projectPath + "\\environment.properties");
		Properties EnivProp = new Properties();
		EnivProp.load(fis);
		String Environment = EnivProp.getProperty("envi");
		//System.out.println(Environment);
		
		fis = new FileInputStream(projectPath + "\\" + Environment + ".properties");
		ChildProp = new Properties();
		ChildProp.load(fis);
		/*
		 * String ChildProperty = ChildProp.getProperty("flipkart");
		 * System.out.println(ChildProperty);
		 */
		
		fis = new FileInputStream(projectPath + "\\or.properties");
		OrProp = new Properties();
		OrProp.load(fis);
		
		
		fis = new FileInputStream(projectPath + "\\log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		//for log4j
		
	}
	
	public static void NavigateURL(String URL) {
		driver.get(DataProp.getProperty(URL));
		
	}
	public static void MaximizeBrowser() {
		driver.manage().window().maximize();
		
	}
	public static void closeBrowser() {
		driver.close();
		
	}
	public static void NavigateBack() {
	driver.navigate().back();
		
	}
	public static String getTtile() {
		return driver.getTitle();
		
	}
	public static void deleteAllcookies() {
		driver.manage().deleteAllCookies();
	}
	public static String getcurrentURL() {
		return driver.getCurrentUrl();
		
	}
	public static void TypeText(String Locatorkey, String Text) {
		//driver.findElement(By.id(OrProp.getProperty(Locatorkey))).sendKeys(Text);
		getElement(Locatorkey).sendKeys(Text);
		
	}

	public static WebElement getElement(String LocatorKey) {
		WebElement element = null;
		
		if(LocatorKey.endsWith("_id")) 
			element = driver.findElement(By.id(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_name"))
			element = driver.findElement(By.name(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_class"))
			element = driver.findElement(By.className(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_xpath"))
			element = driver.findElement(By.xpath(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_cssSelector"))
			element = driver.findElement(By.cssSelector(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_linkText"))
			element = driver.findElement(By.linkText(OrProp.getProperty(LocatorKey)));
		else if(LocatorKey.endsWith("_partiallinkText"))
			element = driver.findElement(By.partialLinkText(OrProp.getProperty(LocatorKey)));
		
			
		return element;
	}

	public static void ClickElement(String Locatorkey) {
		//driver.findElement(By.xpath(OrProp.getProperty(Locatorkey))).click();
		getElement(Locatorkey).click();
	}
	


}
