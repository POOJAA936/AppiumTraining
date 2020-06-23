package com.appiumproject.test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
public class Calendar 
{
	@Test
	public void openApp() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A57");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVerion", "6");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.bbk.calendar");
		cap.setCapability("appActivity", "MainActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	}
}