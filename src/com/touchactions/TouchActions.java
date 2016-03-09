package com.touchactions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TouchActions {

	AndroidDriver<MobileElement> androidDriver = null;
	
	public void touchActions() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM, "");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.truecaller");
	    cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.truecaller.ui.WizardActivity");	
	    androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    
	    TouchAction touch = new TouchAction(androidDriver);
	    
	    WebElement e1 = androidDriver.findElement(By.id("android.webelment"));
	    WebElement e2 = androidDriver.findElement(By.id("android.webelment1"));
	    
	    touch.longPress(e1).moveTo(e2).release().perform();
	    touch.press(e2).perform();
	    touch.tap(e2);
	    
	    
	    
	    
	    
	}
}
