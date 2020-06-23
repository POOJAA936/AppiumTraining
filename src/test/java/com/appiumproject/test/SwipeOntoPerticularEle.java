package com.appiumproject.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class SwipeOntoPerticularEle 
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
		WebElement view = driver.findElementByAccessibilityId("Views");
		driver.tap(1, view, 500);
		//to scrooll into perticular element by using UiAutomator
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoview(text(\"Seek Bar\"))");
		WebElement Seekbar = driver.findElementByAndroidUIAutomator("text(\"Seek Bar\")");
		Point loc = Seekbar.getLocation();
		int startx = loc.getX();
		int starty = loc.getY();
		int endx=(int) (Seekbar.getSize().getWidth()*0.80);
		int endy=starty;
		driver.swipe(startx, starty, endx, endy, 1000);
		}
}