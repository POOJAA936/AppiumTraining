package com.appiumproject.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
public class ParallelExcution 
{
	@Test
	@Parameters({"deviceName","platformVersion","UDID","port"})
	public void appDemo(String deviceName, String platformVersion, String UDID, String port) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("UDID", UDID);
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:"+port+"/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement viewsMenu = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, viewsMenu, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector).scrollIntoView(text(\"SeekBar\"))");
	}
}