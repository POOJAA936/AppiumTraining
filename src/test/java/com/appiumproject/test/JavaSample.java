package com.appiumproject.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
public class JavaSample 
{
	public static final String USERNAME ="poojaa936";
	public static final String AUTOMATION_KEY ="XwspwbQzWRYapSZTxTuE";
	public static final String URL ="https://" + USERNAME + ":" + AUTOMATION_KEY +  "@hub-cloud.browserstack.com/wd";
	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("browserName", "android");
		cap.setCapability("device", "Vivo 1920");
		cap.setCapability("realMobile", "true");
		cap.setCapability("os_version", "7.0");
		cap.setCapability("name", "Bstack-[java] Sample Test");
		WebDriver driver=new RemoteWebDriver(new URL(URL),cap);
		driver.get("http://www.google.com/ncr");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("BrowserStack");
		element.submit();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}