package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Driver {
	
	//avem nevoie pentru rularea in paralel a testelor
	 public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	 //public WebDriver driver;
	 
	 public WebDriver initDriver(String browser) {
		 
		 if(browser.equalsIgnoreCase("chrome")) {
			 
			 driver.set(new ChromeDriver());
			 
			 return driver.get();
		 }
		 
		
		 return null;
	 }


}
