package org.automationmobiletesting.pageObjects.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Profilepage1 {
	
	AndroidDriver driver;

	public Profilepage1 (AndroidDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement imageview;
	
	public void clickimage()
	{
 	imageview.click();
	}
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\\\"Menu\\\"]/android.widget.ImageView")
	private WebElement idk;
	
	public void click()
	{
		idk.click();
	}
	
	
	@AndroidFindBy(xpath="")
	private WebElement check;
	
	public void check2()
	{
		check.click();
	}
	
	
	
}
