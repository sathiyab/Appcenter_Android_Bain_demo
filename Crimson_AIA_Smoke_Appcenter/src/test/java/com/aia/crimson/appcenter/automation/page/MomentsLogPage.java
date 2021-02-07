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
public class MomentsLogPage  {

	By MomentsLogMenu=By.xpath("//android.widget.TextView[normalize-space(@text)='Moments log']");
	By MomentText=By.xpath("//android.widget.TextView[normalize-space(@text)='Moments log']");
	//By MomentDetailedText=By.xpath("//android.widget.TextView[@text='What’s your highlight of the day?  Journal your top moments here...']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public MomentsLogPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@Test()
	public void Verify_Moments_Log_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(MomentsLogMenu).click();
		
	}

}


