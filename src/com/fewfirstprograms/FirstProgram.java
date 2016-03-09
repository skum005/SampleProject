package com.fewfirstprograms;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirstProgram {
	
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void testProgram() throws MalformedURLException {
    
    DesiredCapabilities cap = new DesiredCapabilities();
    
    File appFile = new File("C:\\Users\\Santosh\\Desktop\\application back ups\\com.aranoah.healthkart.plus.apk");
    cap.setCapability("appFile", appFile.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola-xt1022-ZX1B344NGT");
    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
    /*cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.truecaller");
    cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.truecaller.ui.WizardActivity");*/
    
    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    
    //driver.findElementByAndroidUIAutomator(using)
    
	}
}
