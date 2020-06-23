package com.appiumproject.test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class Calculator 
{
	@Test
	public void openAppln() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1921");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.bbkcalculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Calculator");
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.findElementByAccessibilityId("8").click();
		driver.findElementById("com.android.bbkcalculator:id/plus").click();
		driver.findElementByAccessibilityId("9").click();
		driver.findElementById("com.android.bbkcalculator:id/equal").click();
	}
}