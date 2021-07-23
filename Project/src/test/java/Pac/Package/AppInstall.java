package Pac.Package;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppInstall {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		

		 dc.setCapability("deviceName", "Redmi");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability( "platformName", "Android");
		  dc.setCapability("platformVersion","8.1.0");
		  dc.setCapability("UDID","11db64f47d27");
		  
		  //install app
		  //dc.setCapability("app","C:\Users\dell\Downloads\Touch Screen Test_v1.7.14_apkpure.com (1).apk");
		  
		  
		  dc.setCapability("appPacakage","io.appium.android.apis");
		  dc.setCapability("appActivity","ApiDemos");
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
		  System.out.println("App Status-"+driver.isAppInstalled("io.appium.android.apis"));
		  
		  driver.removeApp("io.appium.android.apis");
		  
		  System.out.println("App Status-"+driver.isAppInstalled("io.appium.android.apis"));
		  
		  
		  

	}
	}


