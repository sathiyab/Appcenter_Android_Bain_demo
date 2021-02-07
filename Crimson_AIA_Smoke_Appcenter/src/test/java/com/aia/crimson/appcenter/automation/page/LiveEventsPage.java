package com.aia.crimson.appcenter.automation.page;

import org.junit.Test;
import org.openqa.selenium.By;
import com.aia.crimson.appcenter.automation.base.PropManager;
import com.aia.crimson.appcenter.automation.util.Constants;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;

/**
 * 
 * @author Balaji
 *
 */
public class LiveEventsPage  {

	By LiveEventsMenu=By.xpath("//android.widget.TextView[@text='Live events']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public LiveEventsPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@Test()
	public void Verify_LiveEvents_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(LiveEventsMenu).click();
		
	}

}


