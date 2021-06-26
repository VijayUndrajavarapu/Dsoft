package Started_prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Tng_tc_001 extends Base_May10{
  @Test
  public void f() {
	  System.out.println("execution!");
  }
  @BeforeMethod
  public void Start() {
	 //init();
	  System.out.println("before");
  }

  @AfterMethod
  public void CloseAll() {
	  //driver.quit();
	  System.out.println("after");
  }

}
