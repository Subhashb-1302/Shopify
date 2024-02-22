/** DO NOT CHANGE THIS CLASS. THIS CLASS IS FOR REFERENCE ONLY  **/

package com.selenium.setup;     //Do not change the package name

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	public static WebDriver driver;

	public static WebDriver getDriver() {
	    
	    if(driver == null){
    	    System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");
            FirefoxProfile profile=new FirefoxProfile();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);
            firefoxOptions.setProfile(profile);
            driver = new FirefoxDriver(firefoxOptions);
	    }
		
		return driver;
	}
}

	 	  	  		 	     	     	      	 	
