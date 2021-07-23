package Pac.Package;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScreenTouch {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName", "Redmi");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability( "platformName", "Android");
		  dc.setCapability("platformVersion","8.1.0");
		  dc.setCapability("UDID","11db64f47d27");
		  
		  dc.setCapability("appPacakage","jp.rallwell.siriuth.touchscreentest");
		  dc.setCapability("appActivity",".TouchScreenTestActivity");
		  
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //vertical swipe
		  //driver.swipe(500,377,500,1500,500);
		  
		  //horizontal
		  //driver.swipe(100,850,900,850,1000);
		  //inclined swipe
		  //driver.swipe(100,1400,750,530,1000);
		  
		  Dimension size = driver.manage().window().getSize();
		  
		  int ht = size.getHeight();
		  
		  int wd = size.getWidth();
		  
		  System.out.println("Height or length of phone is-"+ht);
		  
		  //vertical Swipe
		  driver.swipe(wd/2,(int)(ht*0.25), wd/2,(int)(ht*0.80),1000);
		  
		  //Horizontal Swipe
		  driver.swipe((int)(wd*0.20), ht/2,(int)(wd*.80), ht/2,1000);
		  
	}

}
