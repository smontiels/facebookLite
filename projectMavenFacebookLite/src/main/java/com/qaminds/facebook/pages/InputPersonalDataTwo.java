package com.qaminds.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.facebook.core.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class InputPersonalDataTwo extends BasePage{
	
	public InputPersonalDataTwo(MyDriverAppium driver) {
		super(driver);
	}
	
	public void setFormularioData() {
		System.out.println("Before set data number");
		getWait().until(ExpectedConditions.elementToBeClickable(By.className("android.widget.MultiAutoCompleteTextView"))); 
		AndroidElement inputName = getDriver().findElementByClassName("android.widget.MultiAutoCompleteTextView");
		inputName.replaceValue("+15555215554");
		
		getWait().until(ExpectedConditions.elementToBeClickable(By.className("android.view.ViewGroup"))); 
		AndroidElement nextStep = getDriver().findElementByClassName("android.view.ViewGroup");
		nextStep.click();
		System.out.println("After set data number");
	}
}
