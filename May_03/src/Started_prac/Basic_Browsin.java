package Started_prac;

public class Basic_Browsin extends Base_May10
{
	public static void main(String[] args) throws Exception {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Lenovo\\Desktop\\vijay\\chromedriver_win32\\chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver(); driver.get(
		 * "https://stackoverflow.com/questions/47823506/exception-in-thread-main-java-lang-noclassdeffounderror-org-openqa-selenium-w"
		 * ); driver.quit();
		 */
		init();
		openBrowser("chromebrowser");
		NavigateURL("myntra");
		closeBrowser();
		System.out.println("close the browser");
	}
}
