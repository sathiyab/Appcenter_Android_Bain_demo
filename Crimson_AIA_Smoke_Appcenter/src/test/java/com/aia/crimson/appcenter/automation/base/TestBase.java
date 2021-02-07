package com.aia.crimson.appcenter.automation.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aia.crimson.appcenter.automation.util.Constants;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * This class helps to create the driver
 * @author Balaji
 *
 */
public class TestBase {
	
	protected static EnhancedAndroidDriver<MobileElement> driver;
	
	@Rule
	public TestWatcher watcher = Factory.createWatcher();	

	@BeforeClass
	public static void setUp()  {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants.PLATFORM_NAME);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEVICE_NAME);
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Constants.APP_PACKAGE);
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,Constants.APP_ACTIVITY);
		try {
			System.out.println("Creating Driver");
			driver = Factory.createAndroidDriver(new URL(Constants.HUB_URL), caps);
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			
		}
	}
	
    @AfterClass
    public static void tearDown() throws Exception {
    	driver.label("Stopping App");
        driver.quit();
    }	
	
}