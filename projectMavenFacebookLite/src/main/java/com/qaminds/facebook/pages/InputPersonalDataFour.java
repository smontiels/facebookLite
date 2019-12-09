package com.qaminds.facebook.pages;

import com.qaminds.facebook.core.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class InputPersonalDataFour extends BasePage{
	
	public InputPersonalDataFour(MyDriverAppium driver) {
		super(driver);
	}
	
	public void clickSex() {
		System.out.println("Before set data sex");
		AndroidElement nextStep = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]");
		nextStep.click();
		System.out.println("After set data sex");
	}
}
