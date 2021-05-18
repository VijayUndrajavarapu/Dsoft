package Started_prac;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_May10 {

	public static WebDriver driver;
	public static Properties DataProp;
	public static FileInputStream fis;
	public static Properties EnivProp;
	public static String projectPath = "C:\\Users\\Lenovo\\eclipse-workspace\\May_03";
	public static Properties ChildProp;
	
	public static void openBrowser(String browser) {	
		if(DataProp.getProperty(browser).equals("chrome")) { //Key base value 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\vijay\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			driver =new FirefoxDriver();
			
		}
	}
	
	public static void init() throws Exception{
		fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\May_03\\data.properties");
		DataProp = new Properties();
		DataProp.load(fis);
		
		fis = new FileInputStream(projectPath + "\\environment.properties");
		Properties EnivProp = new Properties();
		EnivProp.load(fis);
		String Environment = EnivProp.getProperty("envi");
		System.out.println(Environment);
		
		fis = new FileInputStream(projectPath + "\\" + Environment + ".properties");
		ChildProp = new Properties();
		ChildProp.load(fis);
		/*
		 * String ChildProperty = ChildProp.getProperty("flipkart");
		 * System.out.println(ChildProperty);
		 */
		
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

}
