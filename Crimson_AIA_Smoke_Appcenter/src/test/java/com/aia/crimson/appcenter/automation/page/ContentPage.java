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
public class ContentPage  {

	By ContentMenu=By.xpath("//android.widget.TextView[@text='Content']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public ContentPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@Test()
	public void Verify_Content_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(ContentMenu).click();
		
	}

}


