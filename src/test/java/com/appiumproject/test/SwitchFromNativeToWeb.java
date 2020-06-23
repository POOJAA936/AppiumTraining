package com.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchFromNativeToWeb 
{
	@Test
	public void app() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A57");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@index='10']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Controls']").click();
		System.out.println("Current Context "+driver.getContext());
		Set<String> allContext = driver.getContextHandles(); 
		System.out.println("List o context "+ allContext);
		ArrayList<String> l1=new ArrayList<String>(allContext);
		String currentContext = l1.get(2);
		driver.context(l1.get(1));
		System.out.println("current context is "+driver.getContext());
		Set<String> all_ids = driver.getContextHandles();
	}
}