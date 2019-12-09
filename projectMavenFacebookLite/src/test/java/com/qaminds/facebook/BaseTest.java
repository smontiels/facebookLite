package com.qaminds.facebook;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qaminds.facebook.core.MyDriverAppium;

public class BaseTest {
	
	Logger log = Logger.getLogger(BaseTest.class);
	MyDriverAppium myDriver = new MyDriverAppium();
	
	@BeforeSuite
	public void chargeDriver() {
		try {
			log.debug("se carga el driver");
			myDriver.setUpAppiumDriver();
		} catch(Exception e) {
			log.error("error BaseTest.chargeDriver()", e);
		}
	}
	
	@AfterSuite
	public void finishDriver() {
		if(myDriver != null) {
			myDriver.getDriver().quit();
		}
	}
	
	public void waitFor(int s) {
		myDriver.getDriver().manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
	}
}
