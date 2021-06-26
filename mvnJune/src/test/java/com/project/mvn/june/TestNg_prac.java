package com.project.mvn.june;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNg_prac {
		public ChromeDriver driver;
		
  @Test (priority = 2)
  public void I11pro() {
	  System.out.println("method");
	  driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[4]/a[1]")).click();
	  driver.findElement(By.xpath("//body/main[@id='main']/section[2]/div[1]/div[2]/div[25]/div[2]/a[1]")).click();
	  driver.findElement(By.xpath("//label[@id='noTradeIn_label']")).click();
	  driver.findElement(By.id("897c6010-d666-11eb-93c4-3bac5560d40c_label")).click();
	  driver.findElement(By.className("form-selector-label")).click();
  }
  @Test (priority = 1)
  public void I12() {
	  driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[4]/a[1]")).click();
	  driver.findElement(By.xpath("//body/nav[@id='chapternav']/div[1]/ul[1]/li[1]/a[1]/figure[1]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://www.apple.com/in/?afid=p238%7CsdUuvv563-dc_mtid_187079nc38483_pcrid_527503617288_pgrid_109516736379_&cid=aos-IN-kwgo-brand--slid---product-");
	  
	  System.out.println("befpore");
  }

  @AfterMethod
  public void TearDown() {
	  System.out.println("after");
	  driver.quit();
  }

}
