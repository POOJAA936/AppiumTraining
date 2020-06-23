package com.appiumproject.test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class InstallTheAppInDevice 
{
	@Test
	public void openApp() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1921");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVerion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);//when some security or login is happening again and again
//		cap.setCapability("fullReset", true);//to uninstall the app after test 
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Hi\\Downloads\\ApiDemos.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	}
}