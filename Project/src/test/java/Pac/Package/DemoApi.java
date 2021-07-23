package Pac.Package;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DemoApi {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		
		  dc.setCapability("deviceName", "Redmi");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability( "platformName", "Android");
		  dc.setCapability("platformVersion","8.1.0");
		  dc.setCapability("UDID","11db64f47d27");
		  
		  dc.setCapability("appPacakage","io.appium.android.apis");
		  dc.setCapability("appActivity","ApiDemos");
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  
		  //List<WebElement>options=driver.findElementsByClassName("android.widget.TextView");
		  
		  List<WebElement>options=driver.findElementsByXPath("android.widget.TextView[resource-id='android:id/text1']");
		  
		  
		  for(int i=1; i<options.size(); i++)
		  {
		    System.out.println(options.get(i).getText());
		    
		  }
	}

}
