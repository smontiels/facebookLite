package com.qaminds.facebook.pages;

import com.qaminds.facebook.core.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class InputPersonalDataFive extends BasePage{
	
	public InputPersonalDataFive(MyDriverAppium driver) {
		super(driver);
	}
	
	public void setFormularioData() {
		System.out.println("Before set data pass");
		AndroidElement inputName = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView");
		inputName.sendKeys("password");
		System.out.println("After set data pass");
	}
}
