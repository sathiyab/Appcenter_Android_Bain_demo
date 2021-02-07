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
public class TalkToDoctorOrNursePage  {

	By TalktoDoctor=By.xpath("//android.widget.TextView[@text='Get advice from specialist doctors and nurses']");
	By TalkToADoctorOrNurseMenu=By.xpath("//android.widget.TextView[normalize-space(@text)='Talk to a doctor or nurse']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public TalkToDoctorOrNursePage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@Test()
	public void Verify_Talk_to_Doctor_or_Nurse_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(TalkToADoctorOrNurseMenu).click();
		
	}


}


