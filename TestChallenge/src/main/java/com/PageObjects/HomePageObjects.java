package com.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BaseFile.SelBaseClass;


public class HomePageObjects extends SelBaseClass{


	//WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(5));

	By TendableHomeBtn = By.xpath("//a[@class='logo']//img[@alt='Tendable Logo']");
	By OurStoryBtn=By.xpath("//a[@href='https://www.tendable.com/our-story']");
	By OurSolutionBtn=By.xpath("//a[@href='https://www.tendable.com/our-solution']");
	By WhyTendableBtn=By.xpath("//a[@href='https://www.tendable.com/why-tendable']");
	By RequestADemoBtn=By.xpath("//div[@class='button-links-panel']//a[@class='button']");
	By ContactUsBtn=By.xpath("//div[@class='button-links-panel']//a[@class='button inverted'][1]");
	By MarketingContactUsBtn=By.xpath("//button[@data-target='.toggle-163701']");
	By FormFullName=By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@name='fullName']");
	By FormOrgName=By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@name='organisationName']");
	By FormPhnNo=By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@name='cellPhone']");
	By FormEmail=By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@name='email']");
	By FormJobRollDropdown=By.xpath("//form[@id='contactMarketingPipedrive-163701']//select[@name='jobRole']");
	By FormIAgreeRadioBtn=By.xpath("//form[@id='contactMarketingPipedrive-163701']//input[@name='consentAgreed']");
	By FormSubmitBtn=By.xpath("//form[@id='contactMarketingPipedrive-163701']//button[@class='button']");
	By FormMessageError=By.xpath("//form[@id='contactMarketingPipedrive-163701']//ul[@class='ff-errors']");
	By FormMessage=By.xpath("//form[@id='contactMarketingPipedrive-163701']//textarea[@class='freeform-input']");



	public void  VerifyTendableHomeBtn()
	{
		//Clicking on Home Button
		driver.findElement(TendableHomeBtn).click();
	}


	public void VerifyRequestADemoBtn()
	{
		//To check Request A Demo Button is Present and enabled
		driver.findElement(RequestADemoBtn).isDisplayed();
		driver.findElement(RequestADemoBtn).isEnabled();

	}

	public void VerifyOurStoryBtn()
	{
		//Clicking on Our Story Button
		driver.findElement(OurStoryBtn).click();
	}

	public void VerifyOurSolutionBtn()
	{
		//Clicking on Our Solution Button
		driver.findElement(OurSolutionBtn).click();
	}

	public void VerifyWhyTendableBtn()
	{
		//Clicking on Why Tendable Button
		driver.findElement(WhyTendableBtn).click();
	}

	public void VerifyContactUsBtn()
	{
		//Clicking on Contact Us Button
		driver.findElement(ContactUsBtn).click();
	}

	public void VerifyMarketingBtn()
	{
		//Clicking on Contact Us Button under Marketing section
		driver.findElement(MarketingContactUsBtn).click();
	}

	public void FillFormFullName()
	{
		driver.findElement(FormFullName).sendKeys("Test User");
	}

	public void FillFormOrgName()
	{
		driver.findElement(FormOrgName).sendKeys("SA Tech");
	}

	public void FillFormPhnNo()
	{
		driver.findElement(FormPhnNo).sendKeys("9876543210");
	}

	public void FillFormEmail()
	{
		driver.findElement(FormEmail).sendKeys("testuser@abcd.com");
	}

	public void FillFormSelectJobRole()
	{	
		//Selecting Frontline Worker from the Dropdown menu
		Select s= new Select(driver.findElement(FormJobRollDropdown));
		s.selectByValue("Frontline worker");
	}
	
	public void FillFormMessage()
	{
		//Adding a String to Message Field
		driver.findElement(FormMessage).sendKeys("This is a Test Message");
	}

	public void FillFormRadioBtn()
	{
		//Clicking radio button to select it
		driver.findElement(FormIAgreeRadioBtn).click();
	}

	public void FillFormSubmitBtn() throws InterruptedException
	{
		//Submitting the form
		WebElement SubmitBtn = driver.findElement(FormSubmitBtn);

		JavascriptExecutor js=(JavascriptExecutor)driver; //for scrolling on the webpage
		js.executeScript("arguments[0].scrollIntoView(true)",SubmitBtn);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(FormSubmitBtn));
		Thread.sleep(2000);
		SubmitBtn.click();
	}

	public void VerifyFormBlankMessageBox()
	{
		//Check error message is displayed when Message field is left blank.
		WebElement BlankFieldError=driver.findElement(FormMessageError);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",BlankFieldError);
		Assert.assertEquals(driver.findElement(FormMessageError).getText(),"This field is required");
	}


}
