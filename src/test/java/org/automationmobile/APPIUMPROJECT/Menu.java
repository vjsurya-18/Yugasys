package org.automationmobile.APPIUMPROJECT;

import org.testng.annotations.Test;

import MavenAutomation.pageObjects.android.Profilepage;

public class Menu extends Installing {
	
	@Test
	public void main() throws InterruptedException {
		Thread.sleep(1000);
		details();
		
		Profilepage pg = new Profilepage(driver);	
		
		
		
		
	}
	}