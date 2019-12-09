package com.qaminds.facebook;

import org.testng.annotations.Test;

import com.qaminds.facebook.pages.IndexPage;
import com.qaminds.facebook.pages.InputPersonalDataFive;
import com.qaminds.facebook.pages.InputPersonalDataFour;
import com.qaminds.facebook.pages.InputPersonalDataOne;
import com.qaminds.facebook.pages.InputPersonalDataThree;
import com.qaminds.facebook.pages.InputPersonalDataTwo;

public class IntroductionTest extends BaseTest {
	
	@Test
	public void validationTest() {
		System.out.println("Iniciando test" + myDriver.getDriver());
		myDriver.waitFor(15);
		IndexPage ip = new IndexPage(myDriver);
		ip.doClickCreate();
		myDriver.waitFor(15);
		ip.nextStep();
		myDriver.waitFor(15);
		InputPersonalDataOne ipd1 = new InputPersonalDataOne(myDriver);
		ipd1.setFormularioData();
		myDriver.waitFor(15);
		InputPersonalDataTwo ipd2 = new InputPersonalDataTwo(myDriver);
		ipd2.setFormularioData();
		myDriver.waitFor(15);
		InputPersonalDataThree ipd3 = new InputPersonalDataThree(myDriver);
		ipd3.setFormularioData();
		

		
//		myDriver.waitFor(5);
//		InputPersonalDataFour ipd4 = new InputPersonalDataFour(myDriver);
//		ipd4.clickSex();
//		myDriver.waitFor(5);		
//		InputPersonalDataFive ipd5 = new InputPersonalDataFive(myDriver);
//		ipd5.setFormularioData();
//		myDriver.waitFor(5);
	}

}
