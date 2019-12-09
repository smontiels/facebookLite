package com.qaminds.facebook.core;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyDriverAppium {

	Logger log = Logger.getLogger(MyDriverAppium.class);
	protected AndroidDriver<AndroidElement> driver;
	protected WebDriverWait wait;
	
	public void setUpAppiumDriver() {
		final File classpathRoot = new File(System.getProperty("user.dir"));
		DesiredCapabilities caps = new DesiredCapabilities();
		final File appDir = new File(classpathRoot, "src/test/resources/apps");
		final File app = new File(appDir,"facebook_lite_v175.0.0.9.119.apk");
		
		caps.setCapability("deviceName", "emulator-5554");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("platformVersion", "8.1");
	    caps.setCapability("appPackage", "com.facebook.lite");
	    caps.setCapability("appActivity", "com.facebook.lite.MainActivity");
	    caps.setCapability("autoGrantPermissions", true);
	    //caps.setCapability("noReset", true);
	    //caps.setCapability("clearSystemFiles", true);
	    caps.setCapability("app", app.getAbsolutePath());
	    
	    try {
	    	driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	    }catch(Exception e) {
	    	log.error("error MyDriverAppium.set_UpAppiumDriver() ", e);
	    }
		
	}
	
	public AndroidDriver<AndroidElement> getDriver(){
		return driver;
	}
	
	public void waitFor(int s) {
		driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
	}
}
