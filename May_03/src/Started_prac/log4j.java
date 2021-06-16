package Started_prac;

import org.apache.log4j.Logger;

public class log4j extends Base_May10{
	
	private static Logger log = Logger.getLogger(log4j.class);

	public static void main(String[] args) throws Exception {
		
		init();
		log.info("Loading Init method");
		
		openBrowser("chromebrowser");
		log.info("opening browser :" + DataProp.getProperty("chromebrowser"));
		
		NavigateURL("demosite");
		log.info("openning website:" + DataProp.getProperty("demosite"));
		
		TypeText("login_id","vijaykumar@gmail.com");
		log.info("login ID entered" + OrProp.getProperty("login_id"));
		
		TypeText("loginPassword_name","Encrypt");
		log.info("password entered" + OrProp.getProperty("loginPassword_name"));
		
		ClickElement("RememberMe_name");
		log.info("clicked rememvber check box!" + OrProp.getProperty("RememberMe_name"));
		
		ClickElement("logicButtion_cssSelector");
		log.info("clicking ellement  :" + OrProp.getProperty("logicButtion_cssSelector"));
	
		ClickElement("register_linkText");
		NavigateBack();
		ClickElement("register_partiallinkText");
	}

}
