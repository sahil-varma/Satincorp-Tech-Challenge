package com.Testcases;

import org.testng.annotations.Test;

import com.BaseFile.SelBaseClass;
import com.PageObjects.HomePageObjects;

public class HomePageTests extends SelBaseClass {

	HomePageObjects homePage=new HomePageObjects();

	@Test(priority=1)
	public void ConfirmTopLevelMenusWithRequestADemoButton()
	{

		homePage.VerifyWhyTendableBtn();
		homePage.VerifyRequestADemoBtn();

		homePage.VerifyOurStoryBtn();
		homePage.VerifyRequestADemoBtn();

		homePage.VerifyOurSolutionBtn();
		homePage.VerifyRequestADemoBtn();

		homePage.VerifyTendableHomeBtn();
		homePage.VerifyRequestADemoBtn();
	}

	@Test(priority=2)
	public void SubmitFormWithBlankMessageBoxField() throws InterruptedException
	{
		homePage.VerifyContactUsBtn();
		homePage.VerifyMarketingBtn();
		Thread.sleep(2000);
		homePage.FillFormFullName();
		homePage.FillFormOrgName();
		homePage.FillFormPhnNo();
		homePage.FillFormEmail();
		homePage.FillFormSelectJobRole();
		homePage.FillFormRadioBtn();
		homePage.FillFormSubmitBtn();
	}

	@Test(dependsOnMethods={"SubmitFormWithBlankMessageBoxField"})
	public void VerifyBlankMessageBoxError()
	{
		homePage.VerifyFormBlankMessageBox();
	}
	
	@Test(priority=3)
	public void SubmitFormWithAllFieldsFilled() throws InterruptedException
	{
		homePage.VerifyContactUsBtn();
		homePage.VerifyMarketingBtn();
		Thread.sleep(2000);
		homePage.FillFormFullName();
		homePage.FillFormOrgName();
		homePage.FillFormPhnNo();
		homePage.FillFormEmail();
		homePage.FillFormSelectJobRole();
		homePage.FillFormMessage();
		homePage.FillFormRadioBtn();
		homePage.FillFormSubmitBtn();
	}
	
}