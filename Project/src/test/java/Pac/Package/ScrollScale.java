package Pac.Package;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScrollScale {

	
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName", "Redmi");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability( "platformName", "Android");
		  dc.setCapability("platformVersion","8.1.0");
		  dc.setCapability("UDID","11db64f47d27");
		  
		  dc.setCapability("appPacakage","com.androidsample.generalstore");
		  dc.setCapability("appActivity",".SplashActivity");
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
		  
		  driver = new AndroidDriver(url,dc);
		  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id'android:id/text1']")).click();
		  scrollToElement(driver,"text","india");
		  
		 }
	 private static void scrollToElement(AndroidDriver driver, String an, String av) {
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+",(\"+av+"\))");
		
	}

}


