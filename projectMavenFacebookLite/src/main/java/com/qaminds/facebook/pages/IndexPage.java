package com.qaminds.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.facebook.core.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IndexPage extends BasePage{

	public IndexPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public void doClickCreate() {
		System.out.println("Doing click on create account button");
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup")));
		AndroidElement createAccount = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup");
		createAccount.click();
		System.out.println("Clicked it");
	}
	
	public void nextStep() {
		System.out.println("Doing click on next button");
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]")));
		AndroidElement nextStep = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]");
		nextStep.click();
		System.out.println("Clicked it");
	}

}
