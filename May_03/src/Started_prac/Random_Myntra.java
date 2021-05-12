package Started_prac;

public class Random_Myntra extends Base_May10{
	public static void main(String[] args) throws Exception {
		
		init();
		openBrowser("chromebrowser");
		//deleteAllcookies();
		NavigateURL("myntra");
		NavigateURL("demosite");
		MaximizeBrowser();
		String url = getcurrentURL();
		System.out.println(url);
		//NavigateBack();
		//closeBrowser();
		String title = getTtile();
		System.out.println(title);
	}

	

	
	
	

	
	

	
}
