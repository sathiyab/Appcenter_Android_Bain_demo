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
public class ProfilePage  {

	By ProfileMenu=By.xpath("//android.widget.TextView[@text='Profile']");
	By Account=By.xpath("//android.widget.TextView[@text='ACCOUNT']");
	By ManageProfiles=By.xpath("//android.widget.TextView[@text='Manage profiles']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public ProfilePage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@Test()
	public void Verify_Profile_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(ProfileMenu).click();
		
	}

}


