package org.automationmobile.APPIUMPROJECT;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Installing {

     public AndroidDriver driver;

	 @BeforeTest
	 public  void  Cap() throws MalformedURLException, InterruptedException {
  
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
      	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability(MobileCapabilityType.APP, "C:\\APK files\\eTeParty.apk");
 
     //URL url = new URL("http://127.0.0.1:4723");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver(url, dc);
	
	}
	public  void details() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		    //driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		 
			driver.findElement(By.xpath("//android.view.ViewGroup")).click();
			
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Already have an Account? Login\"]")).click();
			
			WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username *\"]"));
			username.sendKeys("ajithpawar");
			
			WebElement password = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"password *\"]"));
			password.sendKeys("password");
				
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Proceed\"]")).click();
			
//			WebElement login = driver.findElement(AppiumBy.accessibilityId("Log In"));
//			login.click();
//			Thread.sleep(5000);
//			try {
//				WebElement proceed = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Proceed\"]"));
//				proceed.click();
//			} catch (NoSuchElementException e) {
//				System.out.println("Exception is handled : Logged in");
//			}
			
			
			Thread.sleep(5000);
			WebElement PP = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView"));
			PP.click();
			
			System.out.println("successfully logged in");
				
	}
}