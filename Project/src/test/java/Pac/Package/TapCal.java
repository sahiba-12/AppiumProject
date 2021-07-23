package Pac.Package;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TapCal {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName", "Redmi");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability( "platformName", "Android");
		  dc.setCapability("platformVersion","8.1.0");
		  dc.setCapability("UDID","11db64f47d27");
		  
		  dc.setCapability("appPacakage","com.miui.calculator");
		  dc.setCapability("appActivity",".cal.CalculatorActivity");
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  MobileElement seven = (MobileElement)driver.findElement(By.id("com.miui.calculator:id/digit_7"));
		  
		  driver.tap(1, seven, 500);
		  
		  WebElement plus = driver.findElementByAccessibilityId("plus");
		  
		  AndroidElement four = (AndroidElement)driver.findElement(By.id("com.miui.calculator:id/digit_4"));
		  
		  WebElement equals = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]"));
		  
		  String result=driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		  Thread.sleep(2000);
		  System.out.println(result);

	}


	}


